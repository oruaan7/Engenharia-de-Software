Até agora nós colocamos os valores diretamente. Mas programas reais precisam receber informações do usuário.

Podemos utilizar Scanner:

Scanner sc = new Scanner(System.in);

System.out.print("Digite sua idade: ");
int idade = sc.nextInt();

System.out.println("Idade: " + idade);

sc.close();