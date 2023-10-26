import java.sql.DriverManager

fun Create(){
    val url = "jdbc:sqlite:ruta_del_fitxer_sqlite"

    val	con = DriverManager.getConnection(url)

    val st = con.createStatement ()

    val sentSQL = "CREATE TABLE IF NOT EXISTS USUARIO ( " +
            "id INTEGER PRIMARY KEY AUTOINCREMENT, " +
            "nombre VARCHAR(10), " +
            "user VARCHAR(10)," +
            "password VARCHAR(10), " +
            "tlf NUMERIC," +
            "email VARCHAR(20) UNIQUE)"

    st.executeUpdate(sentSQL)
    st.close();
    con.close()
}
