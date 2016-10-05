(ns lolx-category.category
  (:require 
   [compojure.core :refer :all]
   [ring.util.response :refer :all]
   [clojure.data.json :as json]))

(defonce categories [{:id 1 :name "Dom i Ogrod"} {:id 2 :name "Edukacja"} {:id 3 :name "Pozostale"}])

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