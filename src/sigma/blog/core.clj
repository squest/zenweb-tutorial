(ns sigma.blog.core
  (:require [sigma.blog.dbase :as db]
            [sigma.blog.pages :as page]))

(defn home-page
  []
  (apply str (page/tmp-home :home)))

(defn tutorial-page
  []
  (apply str (page/tmp-home :tutorial)))

