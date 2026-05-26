<?php

date_default_timezone_set('Europe/Madrid');

require_once 'config/database.php';
require_once 'controllers/IncidenciaController.php';

$controller = new IncidenciaController();

$action = $_GET['action'] ?? 'index';

switch ($action) {
    case 'show':
        $controller->show($_GET['id']);
        break;
    case 'create':
        $controller->create();
        break;
    case 'store':
        $controller->store();
        break;
    case 'add_comment':
        $controller->addComment($_GET['id']);
        break;
    default:
        $controller->index();
}