(ns curso.aula5)

(def precos [30 700 1000])

(println (precos 0))
(println (get precos 0))
(println "Retorna valor padrao 0 caso nao encontre elemento" (get precos 17 0))
(println "Retorna valor padrao null caso nao encontre elemento" (get precos 17))

; cria um vetor novo com base no vetor original e add um elemento no final
(println (conj precos 3000))
(println "Vetor original imutavel" precos)

; incrementa em 1 a primeira posicao do vetor persistente (mantem o original imutavel)
(println (update precos 0 inc))

; decrementa em 1 a primeira posicao do vetor persistente (mantem o original imutavel)
(println (update precos 0 dec))

(defn soma-1
  [valor]
  (+ valor 1)
  )

; incrementa em 1 a primeira posicao do vetor persistente (mantem o original imutavel)
(println (update precos 0 soma-1))