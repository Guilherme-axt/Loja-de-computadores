<h1>Sistema de Gerenciamento de Estoque de Computadores</h1>

<h2>📖 Sobre o Projeto</h2>
        <p>
            Este projeto é uma aplicação de console desenvolvida em Java que simula um sistema de gerenciamento de estoque para uma loja de computadores. O sistema foi criado como um exercício prático para aplicar os conceitos fundamentais da <strong>Programação Orientada a Objetos (POO)</strong>.
        </p>
        <p>
            A aplicação permite ao usuário cadastrar três tipos diferentes de produtos — <strong>Notebooks, Desktops e Servidores</strong> — e listar todos os itens cadastrados no estoque, exibindo suas especificações técnicas detalhadas.
        </p>

<h2>✨ Principais Conceitos Aplicados</h2>
        <p>
            O núcleo deste projeto foi a aplicação dos pilares da POO para criar um código limpo, organizado e de fácil manutenção.
        </p>
        <ul>
            <li><strong>Herança:</strong> Foi utilizada uma superclasse abstrata <code>Computador</code> que centraliza todos os atributos possíveis que um produto pode ter. As classes <code>Notebook</code>, <code>Desktop</code> e <code>Servidor</code> herdam desta superclasse, reutilizando os campos e evitando a duplicação de código.</li>
            <li><strong>Polimorfismo:</strong> O polimorfismo é demonstrado na classe <code>Loja</code>, onde um único <code>ArrayList&lt;Computador&gt;</code> é capaz de armazenar objetos de todos os tipos de subclasses (<code>Notebook</code>, <code>Desktop</code>, <code>Servidor</code>). Ao percorrer a lista para imprimir os dados, o método <code>imprimir()</code> correto de cada objeto é chamado dinamicamente, simplificando a lógica do programa.</li>
            <li><strong>Abstração e Encapsulamento:</strong> A superclasse <code>Computador</code> é <code>abstract</code>, garantindo que não possa ser instanciada diretamente e forçando as subclasses a implementarem seus próprios comportamentos específicos (<code>cadastrar()</code> e <code>imprimir()</code>). Os atributos são <code>private</code>, e o acesso a eles é controlado por meio de métodos <code>getters</code> e <code>setters</code>, protegendo a integridade dos dados dos objetos.</li>
        </ul>

<h2>📂 Estrutura das Classes</h2>
        <p>
            O projeto está organizado na seguinte estrutura de classes:
        </p>
        <ul>
            <li><code>Loja.java</code>: Classe principal que contém o método <code>main</code>. É responsável por exibir o menu, interagir com o usuário e gerenciar a lista de estoque.</li>
            <li><code>Computador.java</code>: Superclasse abstrata que serve como modelo para todos os tipos de computadores.</li>
            <li><code>Notebook.java</code>: Subclasse que herda de <code>Computador</code> e implementa o cadastro e a impressão dos dados específicos de um notebook.</li>
            <li><code>Desktop.java</code>: Subclasse que herda de <code>Computador</code> e implementa o cadastro e a impressão dos dados específicos de um desktop.</li>
            <li><code>Servidor.java</code>: Subclasse que herda de <code>Computador</code> e implementa o cadastro e a impressão dos dados específicos de um servidor.</li>
        </ul>
