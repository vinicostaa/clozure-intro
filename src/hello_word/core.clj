(ns hello-word.core
  (:gen-class)
  (:require
    [clojure.string :as str]
    [clojure.set :as set])
  (:import java.util.Date
           java.util.Calendar))


(def hello #(str "Hello " %1))
  
(defn hello3
  ([] "Hello World")
  ([name] (str "Hello " name)))

(defn cont-args [& args]
  (str "You passed " (count args) "args: " args))
  

(defn -mrintln (hello3)
  (println (hello3 "Vinicius"))
  (println (cont-args 1 2 3))
  (println (str/replace "This is a test." #"[a-o]" str/upper-case))
  (println (doto (Calendar/getInstance)
             (.set 2000 1 1 0 0 0)
             .getTime)))
