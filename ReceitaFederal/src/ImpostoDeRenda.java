import java.util.Scanner; 

public class ImpostoDeRenda {
	 

	public static void main(String[] args) { 
	Scanner entrada = new Scanner(System.in); 

	double salario;  
	double desconto_ir = 0; 
 
	System.out.println("Entre com o salario:"); 
	salario = entrada.nextDouble(); 
 
	if (salario <= 1247.70) {desconto_ir = 8;}
		else 
	if (salario >= 1247.71 && salario <= 2079.50) {desconto_ir = 9;}
		else
	if (salario >= 2079.51 && salario <= 4159.00) {desconto_ir = 11;}
	else
	if (salario > 4159.00) {desconto_ir = 457.49;} 

	salario = salario - desconto_ir; 

	System.out.println("O salário com o desconto do Imposto de Renda é: " + salario); 
	 
	} 

}


