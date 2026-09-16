| Operador | Significado    |
| -------- | -------------- |
| `>`      | maior que      |
| `<`      | menor que      |
| `>=`     | maior ou igual |
| `<=`     | menor ou igual |
| `==`     | igual          |
| `!=`     | diferente      |

OBS: '=' e atribuicao e '==' e igual.

Operador &&

exemplo: O aluno só pode fazer a prova final se tiver frequência suficiente E nota mínima.

| Frequência |  Nota | Resultado |
| ---------- | ----: | --------- |
| true       |  true | true      |
| true       | false | false     |
| false      |  true | false     |
| false      | false | false     |


if (frequencia >= 75 && nota >= 6) {
    System.out.println("Pode fazer a prova final.");
}

Operador ||

exemplo: O cliente recebe desconto se for estudante OU tiver mais de 60 anos.

| Estudante | +60 anos | Resultado |
| --------- | -------- | --------- |
| true      | true     | true      |
| true      | false    | true      |
| false     | true     | true      |
| false     | false    | false     |

if (estudante || idade >= 60) {
    System.out.println("Cliente possui desconto.");
}

Operador !

Ele transforma:
true → false
false → true

boolean bloqueado = false;

if (!bloqueado) {
    System.out.println("Usuario pode acessar.");
}

!false = true
!true = false