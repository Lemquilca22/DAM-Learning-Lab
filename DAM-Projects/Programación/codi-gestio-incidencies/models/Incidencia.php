<?php

require_once __DIR__ . '/../config/database.php';

class Incidencia {

    private $db;
    private $map;

    public function __construct() {
        $this->db = Database::connect();
        $this->map = require __DIR__ . '/../config/model_map.php';
    }

    public function getAll() {
        $table = $this->map['incidencia_table'];
        $stmt = $this->db->query("SELECT * FROM $table");
        return $stmt->fetchAll(PDO::FETCH_ASSOC);
    }

    public function find($id) {
        $table = $this->map['incidencia_table'];
        $idField = $this->map['incidencia_id'];

        $stmt = $this->db->prepare("SELECT * FROM $table WHERE $idField = ?");
        $stmt->execute([$id]);
        return $stmt->fetch(PDO::FETCH_ASSOC);
    }

    public function create($data) {
        $table = $this->map['incidencia_table'];
        $estat = $this->map['incidencia_estat'];
        $descripcio = $this->map['descripcio_Incidencia'];
        $assumpte = $this->map['assumpte_Incidencia'];
        $dataApertura = $this->map['data_Apertura_Incidencia'];

        $stmt = $this->db->prepare(
            "INSERT INTO $table ($assumpte, $estat, $descripcio, $dataApertura) VALUES (?, ?, ?, ?)"
        );

        return $stmt->execute([
            $data['assumpte_Incidencia'],
            $data['estat'],
            $data['descripcio_Incidencia'],
            date('Y-m-d H:i:s')
        ]);
    }
}