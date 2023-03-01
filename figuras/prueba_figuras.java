package figuras;
import java.util.*;
public class prueba_figuras {
	
	public static void main(String[] args) {
		 Scanner scanner = new Scanner(System.in);
		 
		 //Círculo
		 System.out.println("--------circulo----------");
		 System.out.print("Introduce el radio: ");
	     double radio = scanner.nextDouble();
	     
	     
	     circulo prue = new circulo (radio);
	     
	     System.out.println("Radio: " + prue.getR());
	     System.out.println(prue.getP());
		 System.out.println(prue.getA());

		 // Rectángulo
		 System.out.println("");
		 System.out.println("--------Rectángulo----------");
			 
			 System.out.print("Introduce la base: ");
		     double base = scanner.nextDouble();
		     
		     System.out.print("Introduce la altura: ");
		     double altura = scanner.nextDouble();
		     
		     rectangulo rec = new rectangulo (base, altura);
		     
		     System.out.println("Base: " + rec.getB());
		     System.out.println("Altura: " + rec.getH());
		     System.out.println(rec.getP());
			 System.out.print(rec.getA());
			 System.out.print(rec.getC());

	     //Triángulo
		 System.out.println("");
	   System.out.println("--------Triángulo----------");
				 
				 System.out.print("Introduzca el lado 1: ");
			     double lado1 = scanner.nextDouble();
			     
			     System.out.print("Introduzca el lado 2: ");
			     double lado2 = scanner.nextDouble();
			     
			     System.out.print("Introduzca el lado 3: ");
			     double lado3 = scanner.nextDouble();
			     
			     triangulo tri = new triangulo (lado1, lado2,lado3);
			     
			     System.out.println("Lado 1: " + tri.getLado1());
			     System.out.println("Lado 2: " + tri.getLado2());
			     System.out.println("Lado 3: " + tri.getLado3());
			     System.out.println("Perimetro: " + tri.getPerimetro());
				 System.out.println("Area: " + tri.getArea());
		         System.out.println("Tipo de triangulo: " + tri.getTipo());
		         System.out.println(tri.isRectangulo());
				 
				 
			 scanner.close();
			}

	}

