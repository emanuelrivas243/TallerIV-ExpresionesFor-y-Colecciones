package object SecuenciaMasLarga {
  type Secuencia = Seq[Int]
  type Subsecuencia = Seq[Int]

  // Funcion 1.1.1 subindices

  def subindices(i: Int, n: Int): Set[Seq[Int]] = {
    // Dados i y n devuelve todas las posibles secuencias crecientes de enteros entre i y n
    if (i >= n) Set(List())
    else {
      val subindicesRestantes = subindices(i + 1, n)
      val subindicesConI = for {
        subindiceAtrapado <- subindicesRestantes
      } yield i +: subindiceAtrapado

      subindicesRestantes ++ subindicesConI
    }
  }


  // 1.1.2 subSecuenciaAsoc

  def subSecuenciaAsoc(s: Secuencia, inds: Seq[Int]): Secuencia = {
    // Dadas s, una secuencia, e inds, una secuencia creciente de indices asociadas a s,
    // Devuelve la secuencia correspondiente a la secuencia creciente de indices inds

    for (i <- inds) yield s(i)
  }

  // subSecuenciasDe
  def subSecuenciasDe(s:Secuencia): Set[Subsecuencia] = {
    val indices = subindices(0, s.length)
    for(i <- indices) yield subSecuenciaAsoc(s, i)
  }

  // Función 1.1.3
  def incremental(s:Secuencia): Boolean = {
    val secuenciaIncrementada = (for {
      (num1, num2) <- s zip s.tail
    } yield num1 < num2).forall(_ == true)

    if (secuenciaIncrementada) true
    else false
  }

  // Función subSecuenciasInc
  def subSecuenciasInc(s:Secuencia): Set[Subsecuencia] = {
    val subSecuenciasIncAux = subSecuenciasDe(s)
    for {
      sub <- subSecuenciasIncAux
      if sub.isEmpty || incremental(sub)
    } yield sub
  }

  // Función subsecuenciaIncrementalMasLarga

  def subsecuenciaIncrementalMasLarga(s:Secuencia): Subsecuencia = {

  }


}
