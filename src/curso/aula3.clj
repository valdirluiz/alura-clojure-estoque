(ns curso.aula3)

(defn aplica-desconto?
  [valor-bruto]
  (if (> valor-bruto 100)
    true
    false))

(defn valor-desconto
  "Função de calculo de desconto"
  [valor-bruto]
  (if (aplica-desconto? valor-bruto)
    (let [taxa-desconto (/ 10 100)
          desconto      (* valor-bruto taxa-desconto)]
      (- valor-bruto desconto))
    valor-bruto))

(println (aplica-desconto? 120))
(println (aplica-desconto? 90))

; redefinindo funcao
(defn aplica-desconto?
  [valor-bruto]
  (if (> valor-bruto 100)
    true))

(println (aplica-desconto? 120))
(println (aplica-desconto? 90))

; redefinindo funcao
(defn aplica-desconto?
  [valor-bruto]
   (> valor-bruto 100))

(println (aplica-desconto? 120))
(println (aplica-desconto? 90))

; redefinindo funcao
(defn aplica-desconto?
  [valor-bruto]
  (when (> valor-bruto 100)
    true))

(println (aplica-desconto? 120))
(println (aplica-desconto? 90))