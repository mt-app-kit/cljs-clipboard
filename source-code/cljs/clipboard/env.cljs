
(ns clipboard.env)

;; ----------------------------------------------------------------------------
;; ----------------------------------------------------------------------------

(defn read-text
  ; @param (function)(opt) fulfilled-f
  ; @param (function)(opt) rejected-f
  ;
  ; @usage
  ; (read-text)
  ;
  ; @usage
  ; (defn my-fulfilled-f [content] ...)
  ; (read-text my-fulfilled-f)
  ;
  ; @usage
  ; (defn my-fulfilled-f [content] ...)
  ; (defn my-rejected-f [error] ...)
  ; (read-text my-fulfilled-f my-rejected-f)
  ;
  ; @return (Promise)
  [& [fulfilled-f rejected-f]]
  (letfn [(default-fulfilled-f [content] (.log   js/console content))
          (default-rejected-f  [error]   (.error js/console (.-name error)
                                                            (.-message error)))]
         (.then (js/navigator.clipboard.readText)
                (or fulfilled-f default-fulfilled-f)
                (or rejected-f  default-rejected-f))))

(defn read-data
  ; @important
  ; This function is incomplete and may not behave as expected.
  ;
  ; @param (function)(opt) fulfilled-f
  ; @param (function)(opt) rejected-f
  ;
  ; @usage
  ; (read-data)
  ;
  ; @return (Promise)
  [& [fulfilled-f rejected-f]])
  ; TODO
  ; https://developer.mozilla.org/en-US/docs/Web/API/Clipboard/read)
