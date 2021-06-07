import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/*
	Cargar un arrayList con 12 nombres de estudiantes (String),
	luego separarlos en 3 cursos (3 arrayList) e imprimir dichos cursos.
 */
public class Ejercicio4 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int num=12;
        ArrayList<String> listadoalumnos = new ArrayList<>();

        for (int i = 0; i < num; i++) {
            System.out.println("Ingresar nombre Alumno");
            String nom = scan.nextLine();

            listadoalumnos.add(nom);

        }



        List<String> cursoA =  listadoalumnos.subList(0, 4);
        List<String> cursoB =  listadoalumnos.subList(4, 8);
        List<String> cursoC =  listadoalumnos.subList(8, 12);

        System.out.println("Curso A : "+ cursoA);
        System.out.println("Curso B : "+ cursoB);
        System.out.println("Curso C : "+ cursoC);


        scan.close();

    }
}