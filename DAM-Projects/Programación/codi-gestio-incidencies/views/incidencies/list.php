<h2>Llista d'Incidències</h2>

<a href="index.php?action=create">Nova incidència</a>

<ul>
<?php foreach ($incidencies as $i): ?>
    <li>
        <a href="index.php?action=show&id=<?= $i['id_Incidencia'] ?>">
            <?= htmlspecialchars($i['id_Incidencia']) ?> - <?= htmlspecialchars($i['assumpte_Incidencia']) ?>
        </a>
    </li>
<?php endforeach; ?>
</ul>