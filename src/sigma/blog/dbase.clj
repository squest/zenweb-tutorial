(ns sigma.blog.dbase
  (:require [com.ashafa.clutch :as cl]
            [questdb.core :as qc]))

(defn make-couch
  [conf which-couch?]
  (let [fconf (read-string (slurp conf))]
    (which-couch? fconf)))

(def cdb (make-couch "config.edn" :couch-local))

(defn add-article!
  [cdb data]
  (cl/put-document cdb data))



