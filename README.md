# DesafioContoleFluxo

# 🚀 Desafio: Contador com Tratamento de Exceções - Bootcamp Backend Java (DIO)

## 📝 **Objetivo**
Este desafio consiste na criação de um programa em Java que recebe dois números inteiros como entrada e realiza uma contagem baseada nesses valores. Se o **segundo número** for menor que o **primeiro**, o programa deve lançar uma **exceção personalizada** (`ParametrosInvalidosException`).

---

## 📚 **Conceitos Aplicados**
Este projeto abrange os seguintes tópicos fundamentais:
- **Entrada de dados via `Scanner`**
- **Uso de exceções personalizadas**
- **Lógica de controle e validação de parâmetros**
- **Estrutura de repetição (`for`) para realizar a contagem**

---

## 🛠️ **Implementação**
A implementação consiste em duas classes:
1. `Contador.java` → Responsável pela entrada de dados e lógica de contagem.
2. `ParametrosInvalidosException.java` → Define uma exceção personalizada para validação dos parâmetros.

### 📜 **Código-fonte: `Contador.java`**
```java
import java.util.Scanner;

public class Contador {
    public static void main(String[] args) {
        Scanner terminal = new Scanner(System.in);
        System.out.println("Digite o primeiro parâmetro:");
        int parametroUm = terminal.nextInt();

        System.out.println("Digite o segundo parâmetro:");
        int parametroDois = terminal.nextInt();

        try {
            contar(parametroUm, parametroDois);
        } catch (ParametrosInvalidosException e) {
            System.out.println("Erro: " + e.getMessage());
        } finally {
            terminal.close();
        }
    }

    static void contar(int parametroUm, int parametroDois) throws ParametrosInvalidosException {
        if (parametroDois <= parametroUm) {
            throw new ParametrosInvalidosException("O segundo parâmetro deve ser maior que o primeiro.");
        }

        int contador = parametroDois - parametroUm;
        for (int i = 1; i <= contador; i++) {
            System.out.println("Imprimindo o número " + i);
        }
    }
}
