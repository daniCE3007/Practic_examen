/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package sistemauniversidad;

//Librerias
import javax.swing.JOptionPane;

/**
 *
 * @author fanta
 */
public class main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        //Menu Principal
        int opcionMenu = 0;

        while (opcionMenu != 4) {
            opcionMenu = Integer.parseInt(JOptionPane.showInputDialog("Menu "
                    + "Principal\n"
                    + "Digite qué clase desea registrar:\n"
                    + "1. Estudiante\n"
                    + "2. Curso\n"
                    + "3. Profesor\n"
                    + "4. Salir"));

            if (opcionMenu == 1) {
                //Datos de Estudiante
                String nombreEstudiante = JOptionPane.showInputDialog("Digite "
                        + "el nombre del estudiante");
                String apellidoEstudiante = JOptionPane.showInputDialog("Digite "
                        + "el apellido del estudiante");
                String edadEstudiante = JOptionPane.showInputDialog("Digite la "
                        + "edad del estudiante");
                String cedulaEstudiante = JOptionPane.showInputDialog("Digite la"
                        + " cedula del estudiante");
                String telefonoEstudiante = JOptionPane.showInputDialog("Digite "
                        + "el telefono del estudiante");

                //Creacion de objeto estudiante
                estudiante estudiante1 = new estudiante(nombreEstudiante, 
                        apellidoEstudiante, edadEstudiante, cedulaEstudiante, 
                        telefonoEstudiante);

                //Mostrar datos de estudiante
                JOptionPane.showMessageDialog(null, "Datos del estudiante:\n"
                        + "Nombre: " + estudiante1.getNombre() + "\n"
                        + "Apellido: " + estudiante1.getApellido() + "\n"
                        + "Edad: " + estudiante1.getEdad() + "\n"
                        + "Cedula: " + estudiante1.getCedula() + "\n"
                        + "Telefono: " + estudiante1.getTelefono());
            } else if (opcionMenu == 2) {
                //Datos de Curso
                String nombreCurso = JOptionPane.showInputDialog("Digite el "
                        + "nombre del curso");
                String codigoCurso = JOptionPane.showInputDialog("Digite el "
                        + "codigo del curso");
                String horarioCurso = JOptionPane.showInputDialog("Digite el "
                        + "horario del curso");
                String aulaCurso = JOptionPane.showInputDialog("Digite el aula "
                        + "del curso");
                String cupoCurso = JOptionPane.showInputDialog("Digite el cupo "
                        + "del curso");

                //Creacion de objeto curso
                curso curso1 = new curso(nombreCurso, codigoCurso, horarioCurso,
                        aulaCurso, cupoCurso);

                //Mostrar datos de curso
                JOptionPane.showMessageDialog(null, "Datos del curso:\n"
                        + "Nombre: " + curso1.getNombreCurso() + "\n"
                        + "Codigo: " + curso1.getCodigoCurso() + "\n"
                        + "Horario: " + curso1.getHorarioCurso() + "\n"
                        + "Aula: " + curso1.getAulaCurso() + "\n"
                        + "Cupo: " + curso1.getCupoCurso());
            } else if (opcionMenu == 3) {
                //Datos de Profesor
                String nombreProfesor = JOptionPane.showInputDialog("Digite el "
                        + "nombre del profesor");
                String cursoProfesor = JOptionPane.showInputDialog("Digite el "
                        + "curso del profesor");
                String cedulaProfesor = JOptionPane.showInputDialog("Digite la "
                        + "cedula del profesor");

                //Creacion de objeto profesor
                profesor profesor1 = new profesor(nombreProfesor, cursoProfesor,
                        cedulaProfesor);

                //Mostrar datos de profesor
                JOptionPane.showMessageDialog(null, "Datos del profesor:\n"
                        + "Nombre: " + profesor1.getNombreProfesor() + "\n"
                        + "Curso: " + profesor1.getCursoProfesor() + "\n"
                        + "Cedula: " + profesor1.getCedulaProfesor());
            } else if (opcionMenu == 4) {
                JOptionPane.showMessageDialog(null, "Gracias por usar el "
                        + "programa");
            } else {
                JOptionPane.showMessageDialog(null, "Opcion no valida");
            }
        }
    }
    
}
