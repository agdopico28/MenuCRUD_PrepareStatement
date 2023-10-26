import java.sql.DriverManager
import java.util.*

fun Insert() {
    val url = "jdbc:sqlite:ruta_del_fitxer_sqlite"

    val con = DriverManager.getConnection(url)


    println("Añade una nueva fila")
    println("Introduce el nombre:")
    val nombre = Scanner(System.`in`).nextLine()
    println("Introduce el nickname:")
    val nickname = Scanner(System.`in`).nextLine()
    println("Introduce la contraseña:")
    val pass = Scanner(System.`in`).nextLine()
    println("Introduce el teléfono:")
    val tlf = Scanner(System.`in`).nextInt()
    println("Introduce el email:")
    val email = Scanner(System.`in`).nextLine()

    val st = con.prepareStatement("INSERT OR REPLACE INTO USUARIO (nombre, user, password, tlf, email) VALUES (?,?,?,?,?)");

    st.setString(1,nombre)
    st.setString(2,nickname)
    st.setString(3,pass)
    st.setInt(4,tlf)
    st.setString(5,email)

     st.executeUpdate()

    println("Se ha ejecutado el insert correctamente")
    println()

    st.close()
    con.close()
}