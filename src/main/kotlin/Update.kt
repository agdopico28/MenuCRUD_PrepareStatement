import java.sql.DriverManager
import java.util.*


fun Update(){
    val url = "jdbc:sqlite:ruta_del_fitxer_sqlite"

    val	con = DriverManager.getConnection(url)


    println("Actualiza una fila")
    println("Introduce el id:")
    val id = Scanner(System.`in`).nextInt()
    println("Introduce el nuevo nombre:")
    val nombre = Scanner(System.`in`).nextLine()
    println("Introduce la nueva contraseña:")
    val pass = Scanner(System.`in`).nextLine()


    val st = con.prepareStatement("UPDATE USUARIO SET nombre = ?,password = ? where id =?")

    st.setString(1,nombre)
    st.setString(2,pass)
    st.setInt(3,id)

     st.executeUpdate()
    st.close()
    con.close()
}