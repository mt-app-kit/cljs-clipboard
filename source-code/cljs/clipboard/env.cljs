
(ns clipboard.env
    (:require [clipboard.utils :as utils]))

;; ----------------------------------------------------------------------------
;; ----------------------------------------------------------------------------

(defn read-text
  ; @description
  ; Reads text from the clipboard and calls the given 'on-read-f' function.
  ;
  ; @param (function)(opt) on-read-f
  ; @param (function)(opt) on-error-f
  ;
  ; @usage
  ; (read-text)
  ;
  ; @usage
  ; (defn my-on-read-f [content] ...)
  ; (read-text my-on-read-f)
  ;
  ; @usage
  ; (defn my-on-read-f  [content] ...)
  ; (defn my-on-error-f [error]   ...)
  ; (read-text my-on-read-f my-on-error-f)
  ;
  ; @return (Promise)
  [& [on-read-f on-error-f]]
  (.then (js/navigator.clipboard.readText)
         (or on-read-f  utils/default-on-read-f)
         (or on-error-f utils/default-on-error-f)))

(defn read-data
  ; @important
  ; This function is incomplete and may not behave as expected.
  ;
  ; @description
  ; Reads data from the clipboard and calls the given 'on-read-f' function.
  ;
  ; @param (function)(opt) on-read-f
  ; @param (function)(opt) on-error-f
  ;
  ; @usage
  ; (read-data)
  ;
  ; @usage
  ; (defn my-on-read-f [data] ...)
  ; (read-data my-on-read-f)
  ;
  ; @usage
  ; (defn my-on-read-f  [data]  ...)
  ; (defn my-on-error-f [error] ...)
  ; (read-data my-on-read-f my-on-error-f)
  ;
  ; @return (Promise)
  [& [on-read-f on-error-f]]
  ; TODO
  ; https://developer.mozilla.org/en-US/docs/Web/API/Clipboard/read
  ;
  ; const destinationImage = document.querySelector("#destination");
  ; destinationImage.addEventListener("click", pasteImage);
  ;
  ; async function pasteImage() {
  ;   try {
  ;     const clipboardContents = await navigator.clipboard.read();
  ;     for (const item of clipboardContents) {
  ;       if (!item.types.includes("image/png")) {
  ;         throw new Error("Clipboard does not contain PNG image data.");
  ;       }
  ;       const blob = await item.getType("image/png");
  ;       destinationImage.src = URL.createObjectURL(blob);
  ;     }
  ;   }
  ; }
  (.then (js/navigator.clipboard.read)
         (or on-read-f  utils/default-on-read-f)
         (or on-error-f utils/default-on-error-f)))
