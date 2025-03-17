(ns curso.aula4)

(defn mais-caro-que-100?
  [valor-bruto]
  (> valor-bruto 100))

(defn valor-descontado
  "Aplica desconto de 10% se deve aplicar desconto"
  [valor-bruto aplica?]
  (if (aplica? valor-bruto)
    (let [taxa-desconto (/ 10 100)
          desconto      (* valor-bruto taxa-desconto)]
      (- valor-bruto desconto))
    valor-bruto))

(println "Função como parametro")
(println (valor-descontado 1000 mais-caro-que-100?))
(println (valor-descontado 100 mais-caro-que-100?))


(println "Função como parametro sem nome anonima")
(println (valor-descontado 1000 (fn [valor-bruto] (> valor-bruto 100))))
(println (valor-descontado 100 (fn [valor-bruto] (> valor-bruto 100))))

; pega o primeiro argumento da funcao e ve se é maior que 100
(println (valor-descontado 1000 #(> %1 100)))
(println (valor-descontado 100 #(> %1 100)))

; pega o primeiro argumento da funcao e ve se é maior que 100
(println (valor-descontado 1000 #(> % 100)))
(println (valor-descontado 100 #(> % 100)))

; criando simbolos
(def valor-maior-que-100? #(> % 100))
(def valor-maior-que-100? (fn [valor-bruto] (> valor-bruto 100)))


