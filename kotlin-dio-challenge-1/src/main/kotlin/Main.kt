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

    val educationalContentsObj: EducationalContents = EducationalContents(
        true,
        educationalContents);

    println("Are we accepting new students: " + educationalContentsObj.acceptingNewStudents());
    println(educationalContentsObj.showEducationalContents());
};//end of main()