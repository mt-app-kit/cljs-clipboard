
# cljs-clipboard

### Overview

The <strong>cljs-clipboard</strong> is a simple ClojureScript library for reading
or writing the clipboard.

### deps.edn

```
{:deps {bithandshake/cljs-clipboard {:git/url "https://github.com/bithandshake/cljs-clipboard"
                                     :sha     "xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx"}}}
```

### Current version

Check out the latest commit on the [release branch](https://github.com/bithandshake/cljs-clipboard/tree/release).

### Documentation

The <strong>cljs-clipboard</strong> functional documentation is [available here](https://bithandshake.github.io/cljs-clipboard).

### Changelog

You can track the changes of the <strong>cljs-clipboard</strong> library [here](CHANGES.md).

# Usage

> Some parameters of the following functions and some further functions are not discussed in this file.
  To learn more about the available functionality, check out the [functional documentation](documentation/COVER.md)!

### Index

- [How to copy text to the clipboard?](#how-to-copy-text-to-the-clipboard)

- [How to copy data to the clipboard?](#how-to-copy-data-to-the-clipboard)

- [How to read text from the clipboard?](#how-to-read-text-from-the-clipboard)

- [How to read data from the clipboard?](#how-to-read-text-from-the-clipboard)

### How to copy text to the clipboard?

The [`clipboard.api/copy-text!`](documentation/cljs/clipboard/API.md#copy-text)
function writes the given text to the clipboard.

```
(copy-text! "My text")
```

### How to copy data to the clipboard?

The [`clipboard.api/copy-data!`](documentation/cljs/clipboard/API.md#copy-data)
function writes the given data to the clipboard.

> This function is not available yet (in this version of cljs-clipboard)!

### How to read text from the clipboard?

The [`clipboard.api/read-text`](documentation/cljs/clipboard/API.md#read-text)
function reads text from the clipboard.

```
(defn handler-f [text] (println text))
(read-text handler-f)
```

### How to read data from the clipboard?

The [`clipboard.api/read-data`](documentation/cljs/clipboard/API.md#read-data)
function reads data from the clipboard.

> This function is not available yet (in this version of cljs-clipboard)!
