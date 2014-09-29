(ns sigma.routes
  (:require [compojure.core :refer :all]
            [sigma.blog.core :as blog]))

(defroutes home
  (GET "/" req
       (blog/home-page))
  (GET "/tutorial" req
       (blog/tutorial-page )))
