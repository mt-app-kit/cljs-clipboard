
(ns clipboard.utils)

;; ----------------------------------------------------------------------------
;; ----------------------------------------------------------------------------

(defn default-on-read-f
  ; @ignore
  ;
  ; @param (*) n
  [n]
  (.log js/console n))

(defn default-on-error-f
  ; @ignore
  ;
  ; @param (object) error
  [error]
  (.error js/console (.-name    error)
                     (.-message error)))
