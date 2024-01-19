
(ns clipboard.side-effects
    (:require [clipboard.views         :as views]
              [dom.api                 :as dom]
              [temporary-component.api :as temporary-component]))

;; ----------------------------------------------------------------------------
;; ----------------------------------------------------------------------------

(defn copy-text!
  ; @param (string) text
  ;
  ; @usage
  ; (copy-text! "My text")
  [text]
  (letfn [(f0 [] (-> "text-clipboard" dom/get-element-by-id .-value js/navigator.clipboard.writeText))]
         (temporary-component/append-component! [views/text-clipboard text] f0)
         (temporary-component/remove-component!)))

(defn copy-data!
  ; @important
  ; This function is incomplete and may not behave as expected.
  ;
  ; @param (?) data
  ;
  ; @usage
  ; (copy-data! ...)
  [data])
  ; TODO
  ; https://developer.mozilla.org/en-US/docs/Web/API/Clipboard/write)
