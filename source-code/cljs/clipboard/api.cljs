
(ns clipboard.api
    (:require [clipboard.env          :as env]
              [clipboard.side-effects :as side-effects]))

;; ----------------------------------------------------------------------------
;; ----------------------------------------------------------------------------

; clipboard.env
(def read-text env/read-text)
(def read-data env/read-data)

; clipboard.side-effects
(def copy-text! side-effects/copy-text!)
(def copy-data! side-effects/copy-data!)
