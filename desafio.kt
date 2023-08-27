// [Template no Kotlin Playground](https://pl.kotl.in/WcteahpyN)

enum class Nivel { BASICO, INTERMEDIARIO, AVANCADO }

data class Aluno(val nome: String, val idade: Int, val email: String)

data class ConteudoEducacional(val nome: String, val duracao: Int)

data class Formacao(val nome: String, val conteudos: List<ConteudoEducacional>, val nivel: Nivel) {

    val inscritos = mutableListOf<Aluno>()
    
    fun obterCargaHoraria() : Int{
        var cargaHoraria = 0
        for(conteudo in conteudos) {
            cargaHoraria += conteudo.duracao
        }
        return cargaHoraria
    }    
    
    fun matricular(vararg alunos: Aluno) {
        //TODO("Utilize o parâmetro $usuario para simular uma matrícula (usar a lista de $inscritos).")
        var resultado = true
        for(aluno in alunos){
            if(aluno.nome.isEmpty()) {
                println("Favor preencher o nome do aluno.")
                resultado = false
            } 
            if(aluno.idade <= 12) {
                println("O aluno precisa ter pelo menos 13 anos de idade.")
                resultado = false
            }
            if(aluno.email.isEmpty()) {
                println("Favor informar um e-mail para confirmação da matrícula.")
                resultado = false
            }
            if(!resultado) {
                println("A matrícula não pode ser realizada. É necessário preencher todos os campos e requisitos.")
            }else {
                inscritos.add(aluno)
                println("A matricula de ${aluno.nome} em ${this.nome}, de nível $nivel, com duração total de ${obterCargaHoraria()} horas, foi realizada com sucesso!")
            }            
        }
    }
}

fun main() {
    //TODO("Analise as classes modeladas para este domínio de aplicação e pense em formas de evoluí-las.")    
    
    //Formações para iniciantes
    //Formação JavaScript Developer
    val conteudoIni1 = ConteudoEducacional("Aprenda a Programar do Zero com JavaScript", 15)  
    val conteudoIni2 = ConteudoEducacional("JavaScript para Web: Fundamentos do HTML, CSS e APIs na Prática", 9)
    val conteudoIni3 = ConteudoEducacional("Dominando Conceitos Avançados em JavaScript", 6)
    val conteudoIni4 = ConteudoEducacional("Currículo Online com HTML, CSS e JavaScript: Da Prototipação ao Deploy", 9)
    val conteudosJavaScriptDeveloper = listOf(conteudoIni1, conteudoIni2, conteudoIni3, conteudoIni4)
    val formacaoJavaScriptDeveloper = Formacao("Formação JavaScript Developer", conteudosJavaScriptDeveloper, Nivel.INTERMEDIARIO)
    
    //Formação HTML Web Developer
    val conteudoIni5 = ConteudoEducacional("Primeiros Passos com HTML", 7)  
    val conteudoIni6 = ConteudoEducacional("HTML I: Conceitos Básicos", 9)
    val conteudoIni7 = ConteudoEducacional("HTML II: Ampliando o Conhecimento", 7)
    val conteudosHTMLWebDeveloper = listOf(conteudoIni5, conteudoIni6, conteudoIni7)
    val formacaoHTMLWebDeveloper = Formacao("Formação HTML Web Developer", conteudosHTMLWebDeveloper, Nivel.BASICO)
    
    //Formação CSS Web Developer
    val conteudoIni8 = ConteudoEducacional("Primeiros Passos com CSS", 14)  
    val conteudoIni9 = ConteudoEducacional("Trabalhando com Layouts no CSS", 17)
    val conteudoIni10 = ConteudoEducacional("Refinando os Estilos CSS das Nossas Páginas", 15)
    val conteudosCSSWebDeveloper = listOf(conteudoIni8, conteudoIni9, conteudoIni10)
    val formacaoCSSWebDeveloper = Formacao("Formação CSS Web Developer", conteudosCSSWebDeveloper, Nivel.BASICO)
    
    //Formação SQL Database Specialist
    val conteudoIni11 = ConteudoEducacional("Fundamentos de Banco de Dados", 10)  
    val conteudoIni12 = ConteudoEducacional("Modelo de Entidade Relacional com Banco de Dados", 11)
    val conteudoIni13 = ConteudoEducacional("Explorando a Linguagem de Consulta a Banco de Dados SQL", 21)
    val conteudoIni14 = ConteudoEducacional("Técnicas Avançadas em Banco de Dados com MySQL", 17)    
    val conteudoIni15 = ConteudoEducacional("Transações & Gerenciamento de Banco de Dados com MySQL", 14)
    val conteudosSQLDatabaseSpecialist = listOf(conteudoIni11, conteudoIni12, conteudoIni13, conteudoIni14, conteudoIni15)
    val formacaoSQLDatabaseSpecialist = Formacao("Formação SQL Database Specialist", conteudosSQLDatabaseSpecialist, Nivel.AVANCADO)
    
    //Formação Python Developer
    val conteudoIni16 = ConteudoEducacional("Fundamentos de Python", 12)  
    val conteudoIni17 = ConteudoEducacional("Aprendendo Estrutura de Dados com Python", 8)
    val conteudoIni18 = ConteudoEducacional("Programação Orientada a Objetos com Python", 7)
    val conteudoIni19 = ConteudoEducacional("Integração com Python e Frameworks", 12)    
    val conteudoIni20 = ConteudoEducacional("Tratamento de Dados com Python", 14)
    val conteudoIni21 = ConteudoEducacional("Praticando Desenvolvimento Web com Python", 12)
    val conteudosPythonDeveloper = listOf(conteudoIni16, conteudoIni17, conteudoIni18, conteudoIni19, conteudoIni20, conteudoIni21)
    val formacaoPythonDeveloper = Formacao("Formação Python Developer", conteudosPythonDeveloper, Nivel.INTERMEDIARIO)
    
    //Formação TypeScript Fullstack Developer
    val conteudoIni22 = ConteudoEducacional("Fundamentos do TypeScript", 8)  
    val conteudoIni23 = ConteudoEducacional("Introdução ao React com TypeScript", 7)
    val conteudoIni24 = ConteudoEducacional("Conceitos Avançados de React com TypeScript", 11)
    val conteudoIni25 = ConteudoEducacional("Introdução ao Node com TypeScript", 7)
    val conteudoIni26 = ConteudoEducacional("Conceitos Avançados de Node com TypeScript", 8)
    val conteudosTypeScriptFullstackDeveloper = listOf(conteudoIni22, conteudoIni23, conteudoIni24, conteudoIni25, conteudoIni26)
    val formacaoTypeScriptFullstackDeveloper = Formacao("Formação TypeScript Fullstack Developer", conteudosTypeScriptFullstackDeveloper, Nivel.AVANCADO)
    
    //Formação Java Developer
    val conteudoIni27 = ConteudoEducacional("Fundamentos da Plataforma Java", 10)  
    val conteudoIni28 = ConteudoEducacional("Escopo e Estruturas de Controle em Java", 6)
    val conteudoIni29 = ConteudoEducacional("Programação Orientada a Objetos em Java", 10)
    val conteudoIni30 = ConteudoEducacional("Estrutura de Dados e API de Streams em Java", 17)
    val conteudoIni31 = ConteudoEducacional("Gerenciamento de Dependências e Build em Projetos Java", 6)
    val conteudoIni32 = ConteudoEducacional("Qualidade de Código e Boas Práticas com Java", 15)
    val conteudoIni33 = ConteudoEducacional("Conhecendo o Spring Framework", 15)
    val conteudosJavaDeveloper = listOf(conteudoIni27, conteudoIni28, conteudoIni29, conteudoIni30, conteudoIni31, conteudoIni32, conteudoIni33)
    val formacaoJavaDeveloper = Formacao("Formação Java Developer", conteudosJavaDeveloper, Nivel.INTERMEDIARIO)
    
    //Formação .NET Developer
    val conteudoIni34 = ConteudoEducacional("Fundamentos .NET", 22)  
    val conteudoIni35 = ConteudoEducacional("Explorando a Linguagem C#", 19)
    val conteudoIni36 = ConteudoEducacional("Programação Orientada a Objetos com C#", 11)
    val conteudoIni37 = ConteudoEducacional("Bancos de Dados Relacionais e Não Relacionais com SQL Server e MongoDB", 11)
    val conteudoIni38 = ConteudoEducacional("Integração APIs .NET C# com Entity Framework", 12)
    val conteudoIni39 = ConteudoEducacional("Nuvem com Microsoft Azure", 12)
    val conteudoIni40 = ConteudoEducacional("Testes Unitários com C#", 7)
    val conteudosDotNetDeveloper = listOf(conteudoIni34, conteudoIni35, conteudoIni36, conteudoIni37, conteudoIni38, conteudoIni39, conteudoIni40)
    val formacaoDotNetDeveloper = Formacao("Formação .NET Developer", conteudosDotNetDeveloper, Nivel.INTERMEDIARIO)
    
    //Formação Angular Developer
    val conteudoIni41 = ConteudoEducacional("Fundamentos de Front-end Componentizados", 8)  
    val conteudoIni42 = ConteudoEducacional("Introdução ao Angular", 8)
    val conteudoIni43 = ConteudoEducacional("Single Page Application com Angular", 8)
    val conteudoIni44 = ConteudoEducacional("Aplicações Inteligentes com Angular", 8)    
    val conteudoIni45 = ConteudoEducacional("Manipulando Fluxos no Angular", 5)
    val conteudosAngularDeveloper = listOf(conteudoIni41, conteudoIni42, conteudoIni43, conteudoIni44, conteudoIni45)
    val formacaoAngularDeveloper = Formacao("Formação Angular Developer", conteudosAngularDeveloper, Nivel.INTERMEDIARIO)
    
    //Formação React Developer
    val conteudoIni46 = ConteudoEducacional("Fundamentos de React", 11)  
    val conteudoIni47 = ConteudoEducacional("Conceitos Básicos da Biblioteca", 8)
    val conteudoIni48 = ConteudoEducacional("Ampliando o Conhecimento em React", 7)
    val conteudoIni49 = ConteudoEducacional("React com TypeScript", 4)    
    val conteudoIni50 = ConteudoEducacional("Conceitos Avançados do React", 5)
    val conteudosReactDeveloper = listOf(conteudoIni46, conteudoIni47, conteudoIni48, conteudoIni49, conteudoIni50)
    val formacaoReactDeveloper = Formacao("Formação React Developer", conteudosReactDeveloper, Nivel.INTERMEDIARIO)
    
    //Formações avançadas
    //Formação Machine Learning Specialist
    val conteudoAdv1 = ConteudoEducacional("Introdução ao Machine Learning", 10)  
    val conteudoAdv2 = ConteudoEducacional("Programação para Machine Learning", 15)
    val conteudoAdv3 = ConteudoEducacional("Algoritmos de Treinamento em Machine Learning", 10)
    val conteudoAdv4 = ConteudoEducacional("Teoria do Aprendizado Estatístico", 9)
    val conteudoAdv5 = ConteudoEducacional("Fundamentos e Práticas de Deep Learning", 11)  
    val conteudoAdv6 = ConteudoEducacional("Frameworks de Deep Learning", 11)
    val conteudoAdv7 = ConteudoEducacional("Processamento de Imagens com Machine Learning", 16)
    val conteudoAdv8 = ConteudoEducacional("Visão Computacional com Machine Learning", 9)
    val conteudosMachineLearningSpecialist = listOf(conteudoAdv1, conteudoAdv2, conteudoAdv3, conteudoAdv4, conteudoAdv5, conteudoAdv6, conteudoAdv7, conteudoAdv8)
    val formacaoMachineLearningSpecialist = Formacao("Formação Machine Learning Specialist", conteudosMachineLearningSpecialist, Nivel.AVANCADO)
    
    //Formação Unity 3D Game Developer
    val conteudoAdv9 = ConteudoEducacional("Onboarding: Conhecendo a Formação Unity 3D Developer", 2)  
    val conteudoAdv10 = ConteudoEducacional("Primeiros Passos com Unity", 6)
    val conteudoAdv11 = ConteudoEducacional("Introdução ao Unity 3D", 8)
    val conteudoAdv12 = ConteudoEducacional("Programando em Unity", 13)
    val conteudoAdv13 = ConteudoEducacional("Introdução às Técnicas Artísticas", 23)  
    val conteudoAdv14 = ConteudoEducacional("Construindo do Zero o Cenário do Zeldinha", 11)
    val conteudoAdv15 = ConteudoEducacional("Zeldinha: A Saga Continua", 14)
    val conteudoAdv16 = ConteudoEducacional("Finalizando o Seu Zeldinha com Chave de Ouro", 15)
    val conteudosUnity3DGameDeveloper = listOf(conteudoAdv9, conteudoAdv10, conteudoAdv11, conteudoAdv12, conteudoAdv13, conteudoAdv14, conteudoAdv15, conteudoAdv16)
    val formacaoUnity3DGameDeveloper = Formacao("Formação Unity 3D Game Developer", conteudosUnity3DGameDeveloper, Nivel.AVANCADO)
    
    //Formação Game Developer: Roblox & Metaverse
    val conteudoAdv17 = ConteudoEducacional("Fundamentos do Roblox Studio", 5)
    val conteudoAdv18 = ConteudoEducacional("Introdução à Programação Lua & Luau", 4)  
    val conteudoAdv19 = ConteudoEducacional("Game Developer no Metaverso I: Criando Jogos no Roblox", 8)
    val conteudoAdv20 = ConteudoEducacional("Game Developer no Metaverso II: Profissionalizando seu Workflow", 8)
    val conteudoAdv21 = ConteudoEducacional("Game Developer no Metaverso III: Game Design e Boas Práticas", 11)
    val conteudosGameDeveloper = listOf(conteudoAdv17, conteudoAdv18, conteudoAdv19, conteudoAdv20, conteudoAdv21)
    val formacaoGameDeveloper = Formacao("Formação Game Developer: Roblox & Metaverse", conteudosGameDeveloper, Nivel.INTERMEDIARIO)
    
    //Formação Cybersecurity Specialist
    val conteudoAdv22 = ConteudoEducacional("Conhecendo a Formação de Cibersegurança", 1)  
    val conteudoAdv23 = ConteudoEducacional("Fundamentos de Cibersegurança", 7)
    val conteudoAdv24 = ConteudoEducacional("Testes de Invasão e Busca Por Vulnerabilidades", 8)
    val conteudoAdv25 = ConteudoEducacional("Exploração de Vulnerabilidade e Pós-Exploração", 7)    
    val conteudosCybersecuritySpecialist = listOf(conteudoAdv22, conteudoAdv23, conteudoAdv24, conteudoAdv25)
    val formacaoCybersecuritySpecialist = Formacao("Formação Cybersecurity Specialist", conteudosCybersecuritySpecialist, Nivel.INTERMEDIARIO)
    
    //Formação Blockchain Specialist
    val conteudoAdv26 = ConteudoEducacional("Fundamentos da Blockchain", 7)  
    val conteudoAdv27 = ConteudoEducacional("Crypto com Blockchain", 5)
    val conteudoAdv28 = ConteudoEducacional("Desenvolvimento com Solidity para Blockchain", 11)
    val conteudosBlockchainSpecialist = listOf(conteudoAdv26, conteudoAdv27, conteudoAdv28)
    val formacaoBlockchainSpecialist = Formacao("Formação Blockchain Specialist", conteudosBlockchainSpecialist, Nivel.AVANCADO)
    
    //Formação Web3 Fundamentals
    val conteudoAdv29 = ConteudoEducacional("Introdução e Visão Geral Sobre Web3", 1)  
    val conteudoAdv30 = ConteudoEducacional("Blockchain e Tokens", 15)
    val conteudoAdv31 = ConteudoEducacional("Web3 e Descentralização", 71)
    val conteudoAdv32 = ConteudoEducacional("Metaverso e Mercado Web3", 6)
    val conteudosWeb3Fundamentals = listOf(conteudoAdv29, conteudoAdv30, conteudoAdv31, conteudoAdv32)
    val formacaoWeb3Fundamentals = Formacao("Formação Web3 Fundamentals", conteudosWeb3Fundamentals, Nivel.AVANCADO)
    
    //Formação Android Developer
    val conteudoAdv33 = ConteudoEducacional("Desmistificando a Linguagem de Programação Kotlin", 14)
    val conteudoAdv34 = ConteudoEducacional("Fundamentos de Desenvolvimento Mobile Nativo para Android", 8)
    val conteudoAdv35 = ConteudoEducacional("Noções Básicas de Android com Kotlin", 15)
    val conteudoAdv36 = ConteudoEducacional("Dominando o Android Jetpack", 26)
    val conteudosAndroidDeveloper = listOf(conteudoAdv33, conteudoAdv34, conteudoAdv35, conteudoAdv36)
    val formacaoAndroidDeveloper = Formacao("Formação Android Developer", conteudosAndroidDeveloper, Nivel.INTERMEDIARIO)
    
    //Formação IOS Developer
    val conteudoAdv37 = ConteudoEducacional("Fundamentos de Swift e IOS", 14)
    val conteudoAdv38 = ConteudoEducacional("Dominando a Linguagem de Programação Swift", 11)
    val conteudoAdv39 = ConteudoEducacional("Desenvolvimento de Apps Nativos para IOS", 15)
    val conteudoAdv40 = ConteudoEducacional("Programação Reativa e Testes em Apps IOS", 17)
    val conteudosIOSDeveloper = listOf(conteudoAdv37, conteudoAdv38, conteudoAdv39, conteudoAdv40)
    val formacaoIOSDeveloper = Formacao("Formação IOS Developer", conteudosIOSDeveloper, Nivel.AVANCADO)
    
    //Formação Flutter Specialist
    val conteudoAdv41 = ConteudoEducacional("Introduação ao Flutter", 5)  
    val conteudoAdv42 = ConteudoEducacional("Linguagem de Programação Dart", 11)
    val conteudoAdv43 = ConteudoEducacional("Navegação e Widgets em Flutter", 12)
    val conteudoAdv44 = ConteudoEducacional("Persistência de Dados com SQLite", 7)    
    val conteudoAdv45 = ConteudoEducacional("Consumindo APIs com Flutter", 11)
    val conteudoAdv46 = ConteudoEducacional("Trabalhando com Pacotes Externos em Flutter", 8)
    val conteudoAdv47 = ConteudoEducacional("Gerenciamento de Estado e Padrões em Flutter", 6)
    val conteudoAdv48 = ConteudoEducacional("Introdução ao Firebase", 7)    
    val conteudoAdv49 = ConteudoEducacional("Publicando seus Apps Flutter", 5)
    val conteudosFlutterSpecialist = listOf(conteudoAdv41, conteudoAdv42, conteudoAdv43, conteudoAdv44, conteudoAdv45, conteudoAdv46, conteudoAdv47, conteudoAdv48, conteudoAdv49)
    val formacaoFlutterSpecialist = Formacao("Formação Flutter Specialist", conteudosFlutterSpecialist, Nivel.INTERMEDIARIO)
    
    //Formação C/C++ Developer
    val conteudoAdv50 = ConteudoEducacional("Introdução aos Paradigmas de Programação", 9)  
    val conteudoAdv51 = ConteudoEducacional("Aplicações da Linguagem C/C++ no Mundo Atual", 7)
    val conteudoAdv52 = ConteudoEducacional("Lógica de Programação Utilizando a Linguagem C", 9)
    val conteudoAdv53 = ConteudoEducacional("Conhecimentos Avançados em Linguagem C", 9)    
    val conteudoAdv54 = ConteudoEducacional("Programação Orientada a Objetos (POO) Utilizando C++", 8)
    val conteudosCPlusPlusDeveloper = listOf(conteudoAdv50, conteudoAdv51, conteudoAdv52, conteudoAdv53, conteudoAdv54)
    val formacaoCPlusPlusDeveloper = Formacao("Formação C/C++ Developer", conteudosCPlusPlusDeveloper, Nivel.INTERMEDIARIO)
    
    
    //TODO("Simule alguns cenários de teste. Para isso, crie alguns objetos usando as classes em questão.")
    
    val alunoGuilherme = Aluno("Guilherme", 57, "gt.vasconcellos@gmail.com")
    val alunoJanderson = Aluno("Janderson", 52, "jandquadros@gmail.com")
    val alunoThais = Aluno("Thais", 38, "thais@gmail.com")
    val alunoMario = Aluno("Mario", 41, "mario@gmail.com")
    val alunoIsabella = Aluno("Isabella", 63, "bell@gmail.com")
    val alunoDayse = Aluno("Dayse", 61, "dayse@gmail.com")
    val alunoAnderson = Aluno("Anderson", 43, "ads@gmail.com")
    val alunoSonia = Aluno("Sonia", 59, "stv@gmail.com")
    formacaoJavaScriptDeveloper.matricular(alunoGuilherme, alunoJanderson)
    formacaoJavaDeveloper.matricular(alunoThais)
    formacaoAngularDeveloper.matricular(alunoGuilherme, alunoMario)
    println(formacaoJavaScriptDeveloper.inscritos)
    println(formacaoJavaDeveloper.inscritos)
    println(formacaoAngularDeveloper.inscritos)
    formacaoAndroidDeveloper.matricular(alunoIsabella, alunoSonia)
    formacaoCybersecuritySpecialist.matricular(alunoDayse)
    formacaoGameDeveloper.matricular(alunoAnderson, alunoJanderson)
    println(formacaoAndroidDeveloper.inscritos)
    println(formacaoCybersecuritySpecialist.inscritos)
    println(formacaoGameDeveloper.inscritos)
}
