
(ns clipboard.side-effects
    (:require [clipboard.views         :as views]
              [dom.api                 :as dom]
              [temporary-component.api :as temporary-component]))

;; ----------------------------------------------------------------------------
;; ----------------------------------------------------------------------------

(defn copy-text!
  ; @usage
  ; (copy-text! "My text")
  ;
  ; @param (string) text
  [text]
  (letfn [(f [] (let [text-clipboard (dom/get-element-by-id "text-clipboard")]
                     (-> text-clipboard .-value js/navigator.clipboard.writeText)))]
         (temporary-component/append-component! [views/text-clipboard text] f)
         (temporary-component/remove-component!)))

(defn copy-data!
  ; @usage
  ;
  ;
  [image])
  ; TODO
  ; https://developer.mozilla.org/en-US/docs/Web/API/Clipboard/write)
