(ns curso.aula6)

(def precos [30 700 1000])

(defn aplica-desconto?
  [valor-bruto]
  (> valor-bruto 100))


(defn valor-descontado
  "Função de calculo de desconto"
  [valor-bruto]
  (if (aplica-desconto? valor-bruto)
    (let [taxa-desconto (/ 10 100)
          desconto      (* valor-bruto taxa-desconto)]
      (- valor-bruto desconto))
    valor-bruto))

; mapea a funcao valor descontado para todos os precos
(println (map valor-descontado precos))

; cria range de 10 numeros
(println (range 10))

; filtra valores maior que 5
(println (filter #(> % 5) (range 10)))

; filtra numeros pares
(println (filter even? (range 10)))

; filta precos que o desconto é aplicavel
(println (filter aplica-desconto? precos))

; filta precos que o desconto é aplicavel e calcula o valor descontado
(println (map valor-descontado (filter aplica-desconto? precos)))