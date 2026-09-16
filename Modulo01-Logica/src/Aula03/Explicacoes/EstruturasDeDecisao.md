Estruturas de decisao sao condicoes que determina qual caminho o programa deve seguir.

=============== Estrutura if ===============
Se média >= 7 → aprovado
Se média < 7  → reprovado

no codigo:

if (condicao) {
    // código executado se a condição for verdadeira
}

exemplo real:

int idade = 20;

if (idade >= 18) {
    System.out.println("Maior de idade");
}

Uma comparação sempre produz um resultado: true ou false.
Se idade for maior que 18, ele executa o bloco.
É como se o programa perguntasse:
"A idade é maior ou igual a 18?"

             condição
                 ↓
          idade >= 18 ?
           ↙          ↘
        true          false
          ↓              ↓
    executa bloco    pula bloco


=============== Estrutura if + else ===============

if (idade >= 18) {
    System.out.println("Maior de idade");
} else {
    System.out.println("Menor de idade");
}

podemos ler: 

Se maior ou igual a 18 → Maior de idade
Caso contrário → Menor de idade

             idade >= 18?
              /        \
           true        false
            ↓            ↓
       Maior de idade  Menor de idade


=============== Estrutura else if ===============

nota >= 7       → Aprovado
nota >= 5       → Recuperação
nota < 5        → Reprovado

if (nota >= 7) {
    System.out.println("Aprovado");
} else if (nota >= 5) {
    System.out.println("Recuperacao");
} else {
    System.out.println("Reprovado");
}

                 nota >= 7?
                 /       \
              sim         não
              ↓            ↓
          Aprovado      nota >= 5?
                         /       \
                      sim         não
                      ↓            ↓
                Recuperacao    Reprovado

OBS: Quando encontra uma condição verdadeira em uma sequência if / else if / else, ele executa aquele bloco e não continua verificando os próximos.

