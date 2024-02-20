// Loop While e Condicional If

//Função que recebe uma string como argumento
@main def principal(args: String*) = {

    // Variável
    var i = 0;

    // Loop
    while (i < args.length) {

        // Condicional
        if (i != 0) {
            print(" ");
        }
        print(args(i));

        i += 1;
    }
    
    println();
}