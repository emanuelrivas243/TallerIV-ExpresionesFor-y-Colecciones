import SecuenciaMasLarga._

subindices(2,3)
subindices(0,3)
subindices(3,3)
subindices(1, 5)
subindices(-1, 3)

val s = Seq(20,30,10,40,15,16,17)
subSecuenciaAsoc(s, Seq())
subSecuenciaAsoc(s, Seq(0,2,4))
subSecuenciaAsoc(s, Seq(1,2,4,6))
//subSecuenciaAsoc(s, Seq(-1,3,4)) // error
subSecuenciaAsoc(s, Seq(0,4,5))
subSecuenciaAsoc(s, Seq(0))
//subSecuenciaAsoc(Seq(), Seq(0)) // Error

val s1 = Seq(20,30,10)
subSecuenciasDe(s1)
subSecuenciasDe(Seq(1,2,3))
subSecuenciasDe(Seq(2,4,3))
subSecuenciasDe(Seq(20,30,10,40))
subSecuenciasDe(Seq(10,20,5))

incremental(Seq(20,30,10))
incremental(Seq(10,15,20))
incremental(Seq(2,5,8))
incremental(Seq(50,30,55))
incremental(Seq(24,2,7))

subSecuenciasInc(s)
subSecuenciasInc(s1)
subSecuenciasInc(Seq(20,40,30))
subSecuenciasInc(Seq(2,4,3))
subSecuenciasInc(Seq(0,4,5))

subsecuenciaIncrementalMasLarga(s)
subsecuenciaIncrementalMasLarga(s1)
subsecuenciaIncrementalMasLarga(Seq(20,30,4,3,2,11))
subsecuenciaIncrementalMasLarga(Seq(20,30,10,40,15,16,17, 11))
subsecuenciaIncrementalMasLarga(Seq(24,40,60,15,14,16))

ssimlComenzandoEn(4, Seq(10,9,8,7,6,5,4,3,2,1,22,21,20,19,18,17,16,15,14,13,12,11))
ssimlComenzandoEn(12, Seq(10,9,8,7,6,5,4,3,2,1,22,21,20,19,18,17,16,15,14,13,12,11))
ssimlComenzandoEn(19, Seq(10,9,8,7,6,5,4,3,2,1,22,21,20,19,18,17,16,15,14,13,12,11))
ssimlComenzandoEn(2, Seq(2,4,3,10,12,20))
ssimlComenzandoEn(3, Seq(3,1,5,6,7,2))

subSecIncMasLargaV2(Seq(10,9,8,7,6,5,4,3,2,1,22,21,20,19,18,17,16,15,14,13,12,11))
subSecIncMasLargaV2(s1)
subSecIncMasLargaV2(Seq(2,4,3))
subSecIncMasLargaV2(Seq(4,5,7,3,2))
subSecIncMasLargaV2(Seq(-1, -2, 4, 6, 3))


