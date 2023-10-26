import java.sql.DriverManager
import java.util.*

fun Delete(){
    val url = "jdbc:sqlite:ruta_del_fitxer_sqlite"

    val	con = DriverManager.getConnection(url)

    println("Borra una fila")
    println("Introduce el id:")
    val id = Scanner(System.`in`).nextInt()

    val st = con.prepareStatement("DELETE FROM USUARIO WHERE id = ?")

    st.setInt(1,id)

    st.executeUpdate()
    st.close()
    con.close()
}