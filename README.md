# TratamentodeExce

## Foram feitos exercícios com os tópico abaixo:
+ Exceções Checked e Uncheckd
+ Bloco Try-catch
+ Exceções Multiplas
+ Exceções Customizadas
+ Exceções com a Sintaxe de Try whit Resource
+ Sobrescrevemos a Exceções
### Exceções Checked e Unchecked
Em Java, existem dois tipos de exceções: exceções checked (verificadas) e exceções unchecked (não verificadas). 
As exceções checked são aquelas que herdam da classe Exception, exceto as subclasses de RuntimeException. 
Essas exceções obrigam o desenvolvedor a tratá-las usando blocos try-catch ou declarando-as em uma cláusula throws. 
Já as exceções unchecked são aquelas que herdam da classe RuntimeException ou Error, e não exigem tratamento obrigatório.

### Bloco Try-catch
Em Java, é possível capturar exceções múltiplas em um único bloco catch. 
Isso é útil quando você precisa lidar com diferentes tipos de exceções de maneiras semelhantes. 
As exceções múltiplas são separadas por pipes (|) na cláusula catch.

### Exceções Multiplas

Em Java, é possível capturar exceções múltiplas em um único bloco catch.
Isso é útil quando você precisa lidar com diferentes tipos de exceções de maneiras semelhantes. 
As exceções múltiplas são separadas por pipes (|) na cláusula catch.

### Exceções Customizadas
As exceções customizadas (ou exceções personalizadas) são exceções que você cria definindo suas próprias classes de exceção.
Essas classes devem herdar de Exception ou de suas subclasses.
Você pode criar exceções customizadas para representar erros específicos do seu domínio ou lógica de negócio.

### Sintaxe da Try with Resources
A sintaxe da Try with Resources (também conhecida como try-with-resources) é uma maneira conveniente de trabalhar com recursos que implementam a interface AutoCloseable.
Com essa sintaxe, você pode declarar e inicializar um recurso dentro do bloco try, e o recurso será automaticamente fechado no final do bloco,
independentemente de ocorrer ou não uma exceção.

### Exceções Sobrescritas
Em Java, é possível sobrescrever (override) métodos que lançam exceções. Ao sobrescrever um método, 
você pode escolher lançar exceções diferentes das declaradas no método original. 
No entanto, há algumas regras e restrições a serem seguidas para garantir a compatibilidade e consistência do código.
