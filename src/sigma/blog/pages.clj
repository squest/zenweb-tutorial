(ns sigma.blog.pages
  (:require [net.cgrand.enlive-html :refer :all]))

(def dir "selmer/")

(declare page-list ct-home ct-tutorial)



;; Implementation details

(defn- ct-tutorial
  []
  (html [:center
         [:div {:class "columns large-8"}
          [:h3 (str "Hello !!!")]
          [:p "Welcome to our tutorial hellow centre"]]]))


(defn- ct-home
  []
  (html [:div {:class "column large-5"}
         [:h3 "Another headline"]
         [:p "Some more lorems stuffs"]]))

(deftemplate tmp-home (str dir "base.html")
  [whichpage]
  [:title] (content "Just in time")  
  [:#headline] (content "Some shit!!")
  [:#body] (content (get page-list whichpage)))

(def page-list
  {:home (ct-home)
   :tutorial (ct-tutorial)})
