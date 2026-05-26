<?php

require_once __DIR__ . '/../models/Incidencia.php';
require_once __DIR__ . '/../models/Historial.php';

class IncidenciaController {

    public function index() {
        $model = new Incidencia();
        $incidencies = $model->getAll();
        require __DIR__ . '/../views/incidencies/list.php';
    }

    public function show($id) {
        $incidenciaModel = new Incidencia();
        $historialModel = new Historial();

        $incidencia = $incidenciaModel->find($id);
        $historial = $historialModel->getByIncidencia($id);

        require __DIR__ . '/../views/incidencies/show.php';
    }

    public function create() {
        require __DIR__ . '/../views/incidencies/create.php';
    }

    public function store() {
        $model = new Incidencia();
        $model->create($_POST);
        header("Location: index.php");
        exit;
    }

    public function addComment($id) {
        $incidenciaModel = new Incidencia();
        $historialModel = new Historial();

        $incidencia = $incidenciaModel->find($id);

        if (!$incidencia) {
            header("Location: index.php");
            exit;
        }

        $comentaris = $_POST['comentaris_Historial'] ?? '';
        $estatAnterior = $incidencia['estat_Incidencia'] ?? '';

        if ($comentaris !== '') {
            $historialModel->addEntry($id, $estatAnterior, $comentaris);
        }

        header("Location: index.php?action=show&id=" . urlencode($id));
        exit;
    }
}