/**
 * A DIO possui Formacoes incríveis que têm como objetivo oferecer um conjunto de ConteudosEducacionais
 * voltados para uma stack tecnológica específica, preparando profissionais de TI para o mercado de trabalho.
 * Formacoes possuem algumas características importantes, como nome, nivel e seus respectivos
 * conteudosEducacionais. Além disso, tais experiências educacionais têm um
 * comportamento relevante ao nosso domínio, definido pela capacidade de matricular um ou mais Alunos.
 * */


package org.conductor
import kotlin.collections.ArrayList;

fun main() {
    //Testing EducationContents
    val educationalContents = arrayListOf<String>();
    educationalContents.addAll(listOf("Backend", "Frontend", "ORM", "Database"));

    //Creates the educationContents object
    val educationalContentsObj: EducationalContents = EducationalContents(
        true,
        educationalContents);

    //testing the client member functions
    println(educationalContentsObj);

    educationalContentsObj.toggleAcceptingNewStudents();
    println(educationalContentsObj);

    //Testing the Formations class
    val stacks: ArrayList<String> = arrayListOf("Kotlin", "Unit Testing", "Agile methods");

    val formations: Formations = Formations(
        "Kotlin roadmap",
        1,
        educationalContentsObj,
        stacks
    );

    //Testing the client member functions
    println(formations);
};//end of main()