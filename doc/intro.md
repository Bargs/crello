# Notes

A textual interface for Trello. The goal is to make certain actions easier, like moving multiple cards from one list to another. Something like the [Quicktask Vim Plugin](http://quicktask.aaronbieber.com/).

# Questions

How to represent elements? EDN?

How can I show and allow for editing of all card details, without cluttering up the list view? Should one file contain lists with a brief representation of cards, and another file with full card details, and provide some sort of lighttable integration that makes it easy to jump from a card in a list to a full card description?

# An Example Board

Too verbose and confusing to work with by hand. Need to figure out how to simplify. I don't think the original idea of using Clojure code as the main UI will work. There are too many unimportant (to the user) details that need to be included in the entity representations, like IDs and subscription status.

```
{:id "boardID"
 :name "Board Name"
 :desc "Board Description"
 :lists [
   {:id "listID"
    :name "List Name"
    :cards [
      {:id "cardID"
       :name "Card Name"},
      {:id "cardID2"
       :name "Card 2 Name"}]}]}
```
