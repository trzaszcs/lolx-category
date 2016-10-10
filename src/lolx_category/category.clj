(ns lolx-category.category
  (:require 
   [compojure.core :refer :all]
   [ring.util.response :refer :all]
   [clojure.data.json :as json]))

(defonce categories [
         {:id "1" :name "Sprzątanie"}
         {:id "2" :name "Prace w ogrodzie"}
         {:id "3" :name "Opieka nad zwierzętami"}
         {:id "4" :name "Korepetycje"}
         {:id "5" :name "Odebranie z imprezy"}
         {:id "6" :name "Mycie auta"}
         {:id "7" :name "Ciało"}
         {:id "8" :name "Pozostałe"}])

(defn single
  [request]
  (if-let [id (:category-id (:params request))]
    {:body (first
      (filter
        #(= id (:id %))
        categories))}
    {:status 400}))

(defn list
  [request]
  {:body categories})