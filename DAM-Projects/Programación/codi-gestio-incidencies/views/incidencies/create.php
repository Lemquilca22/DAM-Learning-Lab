<h2>Nova Incidència</h2>

<form method="POST" action="index.php?action=store">

    <label>Assumpte:</label>
    <input type="text" name="assumpte_Incidencia" required><br><br>

    <label>Estat:</label>
    <select name="estat" required>
        <option value="">-- Selecciona estat --</option>
        <option value="Oberta">Oberta</option>
        <option value="En Procés">En Procés</option>
        <option value="Resolta">Resolta</option>
        <option value="Tancada">Tancada</option>
    </select>
    <br><br>

    <label>Descripció:</label>
    <input type="text" name="descripcio_Incidencia" required><br><br>

    <button type="submit">Guardar</button>

</form>

<a href="index.php">Cancel·lar</a>