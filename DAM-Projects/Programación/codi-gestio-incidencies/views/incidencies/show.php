<h2>Detall Incidència</h2>

<p><strong>ID:</strong> <?= htmlspecialchars($incidencia['id_Incidencia']) ?></p>
<p><strong>Estat:</strong> <?= htmlspecialchars($incidencia['estat_Incidencia']) ?></p>
<p><strong>Descripció:</strong> <?= htmlspecialchars($incidencia['descripcio_Incidencia']) ?></p>

<h3>Historial de comentaris</h3>

<?php if (!empty($historial)): ?>
    <ul>
        <?php foreach ($historial as $entrada): ?>
            <li>
                <strong><?= htmlspecialchars($entrada['data_Canvi_Historial']) ?></strong><br>
                <?php if (!empty($entrada['comentaris_Historial'])): ?>
                    <?= nl2br(htmlspecialchars($entrada['comentaris_Historial'])) ?>
                <?php else: ?>
                    <em>Sense comentaris</em>
                <?php endif; ?>
            </li>
        <?php endforeach; ?>
    </ul>
<?php else: ?>
    <p><em>Encara no hi ha comentaris per aquesta incidència.</em></p>
<?php endif; ?>

<h3>Afegir comentari</h3>
<form method="POST" action="index.php?action=add_comment&id=<?= urlencode($incidencia['id_Incidencia']) ?>">
    <textarea name="comentaris_Historial" rows="4" cols="50" required></textarea><br><br>
    <button type="submit">Afegir comentari</button>
</form>

<a href="index.php">Tornar</a>