class Library {
	String libraryName;
	
	Library(String libraryName) {
		this.libraryName = libraryName;
	}
	
	class Book {
		String getLibraryName() {
			return libraryName;
		}
	}
}

class Test5 {
	public static void main(String[] args) {
		Library l = new Library("CDGI");
		Library.Book b = l.new Book();
		
		String name = b.getLibraryName();
		
		System.out.println("Library name = "+name);
	}
}