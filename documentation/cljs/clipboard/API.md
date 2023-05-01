
# clipboard.api ClojureScript namespace

##### [README](../../../README.md) > [DOCUMENTATION](../../COVER.md) > clipboard.api

### Index

- [copy-data!](#copy-data)

- [copy-text!](#copy-text)

- [read-data](#read-data)

- [read-text](#read-text)

### copy-data!

```
@usage
  ;
```

<details>
<summary>Source code</summary>

```
(defn copy-data!
  [image])
```

</details>

<details>
<summary>Require</summary>

```
(ns my-namespace (:require [clipboard.api :refer [copy-data!]]))

(clipboard.api/copy-data!)
(copy-data!)
```

</details>

---

### copy-text!

```
@param (string) text
```

```
@usage
(copy-text! "My text")
```

<details>
<summary>Source code</summary>

```
(defn copy-text!
  [text]
  (letfn [(f [] (let [text-clipboard (dom/get-element-by-id "text-clipboard")]
                     (-> text-clipboard .-value js/navigator.clipboard.writeText)))]
         (temporary-component/append-component! [views/text-clipboard text] f)
         (temporary-component/remove-component!)))
```

</details>

<details>
<summary>Require</summary>

```
(ns my-namespace (:require [clipboard.api :refer [copy-text!]]))

(clipboard.api/copy-text! ...)
(copy-text!               ...)
```

</details>

---

### read-data

```
@param (function)(opt) fulfilled-f
@param (function)(opt) rejected-f
```

```
@usage
(read-data)
```

```
@return (Promise)
```

<details>
<summary>Source code</summary>

```
(defn read-data
  [& [fulfilled-f rejected-f]])
```

</details>

<details>
<summary>Require</summary>

```
(ns my-namespace (:require [clipboard.api :refer [read-data]]))

(clipboard.api/read-data ...)
(read-data               ...)
```

</details>

---

### read-text

```
@param (function)(opt) fulfilled-f
@param (function)(opt) rejected-f
```

```
@usage
(read-text)
```

```
@usage
(defn my-fulfilled-f [content] ...)
(read-text my-fulfilled-f)
```

```
@usage
(defn my-fulfilled-f [content] ...)
(defn my-rejected-f [error] ...)
(read-text my-fulfilled-f my-rejected-f)
```

```
@return (Promise)
```

<details>
<summary>Source code</summary>

```
(defn read-text
  [& [fulfilled-f rejected-f]]
  (letfn [(default-fulfilled-f [content] (.log   js/console content))
          (default-rejected-f  [error]   (.error js/console (.-name error)
                                                            (.-message error)))]
         (.then (js/navigator.clipboard.readText)
                (or fulfilled-f default-fulfilled-f)
                (or rejected-f  default-rejected-f))))
```

</details>

<details>
<summary>Require</summary>

```
(ns my-namespace (:require [clipboard.api :refer [read-text]]))

(clipboard.api/read-text ...)
(read-text               ...)
```

</details>

---

This documentation is generated with the [clj-docs-generator](https://github.com/bithandshake/clj-docs-generator) engine.

