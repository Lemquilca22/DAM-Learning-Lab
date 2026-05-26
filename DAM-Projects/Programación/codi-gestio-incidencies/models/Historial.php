<?php

require_once __DIR__ . '/../config/database.php';

class Historial {

    private $db;
    private $map;

    public function __construct() {
        $this->db = Database::connect();
        $this->map = require __DIR__ . '/../config/model_map.php';
    }

    public function getByIncidencia($incidenciaId) {
        $table = $this->map['historial_table'];
        $idIncidenciaField = $this->map['historial_incidencia_id'];

        $stmt = $this->db->prepare("SELECT * FROM $table WHERE $idIncidenciaField = ? ORDER BY {$this->map['historial_data_canvi']} DESC");
        $stmt->execute([$incidenciaId]);
        return $stmt->fetchAll(PDO::FETCH_ASSOC);
    }

    public function addEntry($incidenciaId, $estatAnterior, $comentaris) {
        $table = $this->map['historial_table'];
        $estatField = $this->map['historial_estats_anteriors'];
        $dataField = $this->map['historial_data_canvi'];
        $comentarisField = $this->map['historial_comentaris'];
        $idIncidenciaField = $this->map['historial_incidencia_id'];

        $stmt = $this->db->prepare(
            "INSERT INTO $table ($estatField, $dataField, $comentarisField, $idIncidenciaField) VALUES (?, ?, ?, ?)"
        );

        return $stmt->execute([
            $estatAnterior,
            date('Y-m-d H:i:s'),
            $comentaris,
            $incidenciaId
        ]);
    }
}

