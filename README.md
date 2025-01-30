# Repositório de Design Patterns

Estou criando este repositório para explicar alguns **Design Patterns**, abrangendo tanto a **teoria** quanto a **parte técnica**.  
A parte técnica está dividida em 3 categorias: **Criação**, **Comportamental** e **Estrutural**.

---

## O que é Design Patterns?

**Design Patterns** (ou "Padrões de Projeto") são soluções reutilizáveis para problemas comuns que aparecem durante o desenvolvimento de software.  
Eles não são códigos prontos, mas **modelos** ou **"receitas"** que ajudam a organizar e estruturar o código de forma eficiente, seguindo boas práticas.

---

## Classificação de Design Patterns

Os Design Patterns são classificados em 3 categorias, com **24 tipos principais**:

1. **Padrões de Criação:**  
   Fornecem mecanismos de criação de objetos que aumentam a flexibilidade e a reutilização do código.

2. **Padrões Estruturais:**  
   Explicam como montar classes e objetos em estruturas maiores, enquanto ainda mantêm as estruturas flexíveis e eficientes.

3. **Padrões Comportamentais:**  
   Lidam com a comunicação eficiente e a atribuição de responsabilidades entre objetos.

---

## Exemplos de Design Patterns

### **1. Factory Method (Padrão Criacional):**  
É um padrão de design criacional que fornece uma interface para criar objetos, mas permite que as subclasses decidam quais classes instanciar.

---

### **2. Adapter (Padrão Estrutural):**  
É um padrão de design estrutural que permite que duas interfaces incompatíveis trabalhem juntas.  
Ele age como um "adaptador" que converte a interface de uma classe para a interface que o cliente espera.

---

### **3. Strategy (Padrão Comportamental):**  
O Strategy é um padrão comportamental que funciona da seguinte forma:  
1. **Estratégia:** Define uma interface comum para todos os algoritmos.  
2. **Estratégias Concretas:** Implementam a interface com algoritmos específicos.  
3. **Contexto:** Mantém uma referência para a estratégia atual e delega o trabalho para ela.

---

# SOLID

## São 5 princípios da programação orientada a objetos

### S: Single Responsibility Principle (Princípio da Responsabilidade Única)
Diz que uma classe/objeto deve ter apenas uma responsabilidade e não várias. Isso facilita na hora da manutenção caso seja necessário.

---

### O: Open-Closed Principle (Princípio Aberto-Fechado)
Diz que uma classe deve estar aberta para ser estendida, mas fechada para ser modificada. Alterar uma classe já existente para adicionar um novo comportamento pode introduzir bugs em algo que já estava funcionando corretamente.

---

### L: Liskov Substitution Principle (Princípio da Substituição de Liskov)
Diz que uma subclasse deve ser substituível por sua classe base sem quebrar o código. Se você tem uma classe Pai e uma classe Filha, deve ser possível trocar a classe Pai pela Filha sem que o programa pare de funcionar ou tenha comportamentos inesperados.

✔ Se uma classe herda outra, ela deve poder substituí-la sem causar problemas.
✔ Evite criar classes que herdam comportamentos que não podem cumprir.
✔ Se precisar, use composição ao invés de herança.

---

### I: Interface Segregation Principle (Princípio da Segregação da Interface)
Diz que uma classe não deve ser forçada a implementar interfaces e métodos que não irá utilizar.

---

### D: Dependency Inversion Principle (Princípio da Inversão da Dependência)
Esse princípio diz que classes de alto nível não devem depender diretamente de classes de baixo nível, mas sim de abstrações.


