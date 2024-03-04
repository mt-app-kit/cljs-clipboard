
(ns clipboard.side-effects
    (:require [clipboard.views         :as views]
              [dom.api                 :as dom]
              [hidden-container.api :as hidden-container]))

;; ----------------------------------------------------------------------------
;; ----------------------------------------------------------------------------

(defn copy-text!
  ; @description
  ; Copies the given text to the clipboard.
  ;
  ; @param (string) text
  ;
  ; @usage
  ; (copy-text! "My text")
  [text]
  (letfn [(f0 [] (-> "text-clipboard" dom/get-element-by-id .-value js/navigator.clipboard.writeText))]
         (hidden-container/append-component! [views/text-clipboard text] f0)
         (hidden-container/remove-component!)))

(defn copy-data!
  ; @important
  ; This function is incomplete and may not behave as expected.
  ;
  ; @description
  ; Copies the given data to the clipboard.
  ;
  ; @param (?) data
  ;
  ; @usage
  ; (copy-data! ...)
  [data])
  ; TODO
  ; https://developer.mozilla.org/en-US/docs/Web/API/Clipboard/write
