package com.collections;

import java.util.Stack;

public class TextEditor {

	private StringBuilder document;
	private Stack<String> undoStack;
	private Stack<String> redoStack;

	TextEditor() {
		document = new StringBuilder();
		undoStack = new Stack<>();
		redoStack = new Stack<>();
	}

	public void saveStateForUndo(StringBuilder document) {

		undoStack.push(document.toString());
		redoStack.clear();
	}

	public void addText(String text) {
		saveStateForUndo(document);
		document.append(text);
		System.out.println("Text added successfully!");
	}

	public void deleteText(int n) {

		if (n >= 0 && n <= document.length()) {
			saveStateForUndo(document);
			document.delete(document.length()-n, document.length());
			System.out.println("Text deleted successfully!");
		}
	}

	public void searchWord(String word) {

		int startIndex = document.indexOf(word);
		
		if (startIndex != -1) {
			System.out.println("Word found at initial: " + startIndex);
		} else {
			System.out.println("Word not found!");
		}
	}

	public void replaceWord(String word, String newWord) {

		int startIndex = document.indexOf(word);

		if (startIndex != -1) {

			saveStateForUndo(document);

			document.replace(startIndex, startIndex + word.length() , newWord);
			
			System.out.println("Text replaced successfully!");

		} else {
			System.out.println("Word not found!");

		}
	}

	public void undo() {

		if (!undoStack.isEmpty()) {
			redoStack.push(document.toString());
			document = new StringBuilder(undoStack.pop());
			System.out.println("Undo successful!");
		}

	}

	public void redo() {

		if (!redoStack.isEmpty()) {
			
			undoStack.push(document.toString());
			document = new StringBuilder(redoStack.pop());
			System.out.println("Redo successful!");
		}
	}
	
	public void display() {
		System.out.println("Current Document:");
		System.out.println(document);
	}

}
