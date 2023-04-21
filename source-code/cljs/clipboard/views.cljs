
(ns clipboard.views)

;; ----------------------------------------------------------------------------
;; ----------------------------------------------------------------------------

(defn text-clipboard
  ; @ignore
  ;
  ; @param (string) text
  [text]
  [:input {:defaultValue text :id :text-clipboard}])
