📱 ReciclaCuritiba
Projeto desenvolvido para promover a reciclagem em Curitiba, conectando moradores aos ecopontos da cidade e educando sobre o descarte correto de resíduos recicláveis. O aplicativo foi criado com foco em sustentabilidade, acessibilidade e usabilidade, aplicando conceitos de desenvolvimento Android.
🚀 Funcionalidades

Lista de Ecopontos: Visualize os ecopontos cadastrados com nome, endereço e materiais aceitos, exibidos em um RecyclerView.
Cadastro de Ecopontos: Adicione novos ecopontos diretamente no banco de dados SQLite.
Busca por Material: Pesquise ecopontos que aceitam materiais específicos (ex.: "papel", "plástico").
Dicas Sustentáveis: Acesse dicas práticas para um estilo de vida mais sustentável.
Navegação Intuitiva: Interface amigável com menu principal para acessar todas as funcionalidades.

🧠 Tecnologias e Componentes Aplicados



Componente/Tecnologia
Utilização



RecyclerView
Exibição de listas de ecopontos e dicas sustentáveis


SQLite
Armazenamento e gerenciamento de dados dos ecopontos


Activities
5 telas para navegação (Main, Ecopontos, Cadastro, Dicas, Busca)


Kotlin
Linguagem principal para lógica e interface


XML Layouts
Design das telas com cores personalizadas


Banco de Dados
Tabela ecopontos no SQLite:



Campo
Tipo



id
INTEGER PRIMARY KEY AUTOINCREMENT


nome
TEXT


endereco
TEXT


materiais
TEXT (ex.: "papel, plástico, vidro")


🛠️ Tecnologias

Linguagem: Kotlin
Plataforma: Android
IDE Recomendada: Android Studio
Dependências: Bibliotecas padrão do Android (RecyclerView, SQLite)
Cores:
Fundo: #FFFFFF (branco), #F4F4F4 (cinza claro)
Títulos: #4B8B3B (verde escuro)
Botões: #9DD549 (verde claro)
Texto: #333333 (cinza escuro), #FFFFFF (branco)



🧪 Como Executar

Clone o repositório:git clone https://github.com/CamilaStolte/ReciclaCuritiba.git


Abra o projeto no Android Studio.
Sincronize com o Gradle (Sync Project with Gradle Files).
Configure um dispositivo Android ou emulador.
Execute o aplicativo clicando em Run.

📁 Estrutura de Diretórios
ReciclaCuritiba/
│
├── app/
│   ├── src/
│   │   ├── main/
│   │   │   ├── java/com/example/reciclacuritiba/
│   │   │   │   ├── MainActivity.kt
│   │   │   │   ├── EcopontosActivity.kt
│   │   │   │   ├── CadastroEcopontoActivity.kt
│   │   │   │   ├── DicasActivity.kt
│   │   │   │   ├── BuscaMaterialActivity.kt
│   │   │   │   └── db/
│   │   │   │       └── DatabaseHelper.kt
│   │   │   ├── res/
│   │   │   │   ├── layout/
│   │   │   │   │   ├── activity_main.xml
│   │   │   │   │   ├── activity_ecopontos.xml
│   │   │   │   │   ├── activity_cadastro_ecoponto.xml
│   │   │   │   │   ├── activity_dicas.xml
│   │   │   │   │   ├── activity_busca_material.xml
│   │   │   │   │   └── item_ecoponto.xml
│   │   │   │   ├── values/
│   │   │   │   │   ├── colors.xml
│   │   │   │   │   └── strings.xml
│   │   │   └── AndroidManifest.xml
│
├── gradle/
├── .gitignore
├── build.gradle.kts
├── gradle.properties
├── gradlew
├── gradlew.bat
├── settings.gradle.kts
├── README.md

📅 Histórico de Desenvolvimento

Inicialização do repositório e configuração do projeto Android
Implementação da MainActivity com menu principal
Desenvolvimento da EcopontosActivity com RecyclerView
Criação do banco de dados SQLite e CadastroEcopontoActivity
Adição da DicasActivity com lista de dicas sustentáveis
Implementação da BuscaMaterialActivity com filtro por material

📝 Contribuição

Faça um fork do repositório.
Crie uma branch para sua feature (git checkout -b feature/nova-funcionalidade).
Commit suas alterações (git commit -m 'Adiciona nova funcionalidade').
Envie para o repositório remoto (git push origin feature/nova-funcionalidade).
Abra um Pull Request.

📜 Licença
Este projeto está licenciado sob a MIT License.
📧 Contato
Para dúvidas ou sugestões, entre em contato:

Camila Stolte - GitHub


ReciclaCuritiba: Conectando você com a reciclagem para uma Curitiba mais sustentável! 🌱
