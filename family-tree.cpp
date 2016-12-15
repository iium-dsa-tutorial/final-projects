// Binary Tree Sample
#include <iostream>
#include <vector>
#include <string>

using namespace std;

template<class T>
struct Node{
	T value;
	Node<T>* left;
	Node<T>* right;
	Node(){} // Empty Constructor
	Node(T _v){ // Constructor with value only
		value = _v;
		left = NULL;
		right = NULL;
	}
	Node(T _v, Node<T>* _left, Node<T>* _right){ // Constructor with all parameters
		value = _v;
		left = _left;
		right = _right;
	}
};

template<class T>
class BST{
	private:
		Node<T>* root;
	public:
		BST(){
			root = NULL;
		}

		void insertHelper(Node<T>* &current, T value){
			if(current==NULL) current = new Node<T>(value); // When it reaches the bottom/leaf node
			else{
				if(value<current->value){
					insertHelper(current->left, value); // Going to the left side
				}else if(value>current->value){
					insertHelper(current->right, value); // Going to the right side
				}
			}
		}

		void insert(T value){
			if(root==NULL) root = new Node<T>(value); // When tree is empty
			else{
				insertHelper(root, value);
			}
		}

		void deleteNodeHelper(Node<T>* &t, Node<T>* &p){
			if(t->left==NULL && t->right==NULL){
				// no children
				if(p==NULL){
					root = NULL;
					delete t;
					return;
				}	
				if(p->left == t) p->left = NULL;
				else p->right = NULL;
				delete t;

			}else if(t->left==NULL || t->right==NULL){
				// one children
				if(p==NULL){
					if(t->left!=NULL){
						root->value = t->left->value;
						root = t->left;
					}else {
						root->value = root->right->value;
						root = root->right;
					}
					delete t;
					return;
				}
				if(p->left == t) {
					// when t is in the left of its parent
					if(t->left == NULL) p->left = t->right;
					else p->left = t->left;
				}else{
					//when t is in the right of its parent
					if(t->left == NULL) p->right = t->right;
					else p->right = t->left;
				}
				delete t;
			}else{
				// two children
				Node<T> *s = t->right, *sp=t; // t->right is the root of the right sub-tree
				while(s->left != NULL){
					sp = s;
					s = s->left;
				}
				// at this point we found the smallest node in the right sub-tree
				t->value = s->value;
				deleteNodeHelper(s,sp);
			}
		}

		void deleteNode(T value){
			if(root==NULL) return;
			Node<T> *t = root, *p=NULL;
			while(t!=NULL){
				if(value < t->value){
					p = t;
					t = t->left;		
				}else if(value > t->value){
					p = t;
					t = t->right;
				}else{
					// found our match
					deleteNodeHelper(t,p);
					break;
				}
			}
		}

		void displayPrefix(Node<T>* current){
			if(current!=NULL){
				cout<<current->value<<" ";
				displayPrefix(current->left);
				displayPrefix(current->right);
			}
		}

		bool find(Node<T>* current, T value){
			bool f = false;
			if(current!=NULL){
				if(current->value==value) return true;
				else if(value<current->value){
					f = find(current->left, value);
				}else{
					f = find(current->right, value);
				}
			}
			return f;
		}	

		bool has(T value){
			// return true if the value is in the tree else return false
			
			return find(root, value);
		}

		void displayInfix(Node<T>* current){
			if(current!=NULL){
				displayInfix(current->left);
				cout<<current->value<<" ";
				displayInfix(current->right);
			}
		}

		void displayPostfix(Node<T>* current){
			if(current!=NULL){
				displayPostfix(current->left);
				displayPostfix(current->right);
				cout<<current->value<<" ";
			}
		}

		void display(int order=0){
			if(root==NULL){
				cout<<"Empty"<<endl;
				return;
			}
			if(order==0) displayPrefix(root);
			else if(order==1) displayInfix(root);
			else if(order==2) displayPostfix(root);
			cout<<endl;
		}

};

int main(){
	BST<string> tree;
	
	cout << "Family tree of 2 parents and 4 children \n\n";
	string names[7];
	char search,del;
	int searchn,i2;
	string name;
	
	names[0] = {"root"};
	cout << "Enter father's name: ";
	cin >> names[1];
	cout << "Enter mother's name: ";
	cin >> names[2];
	cout << "Enter first child name: ";
	cin >> names[3];
	cout << "Enter second child name: ";
	cin >> names[4];
	cout << "Enter third child name: ";
	cin >> names[5];
	cout << "Enter fourth child name: ";
	cin >> names[6];	
	
	for(int i=0;i<7;i++){
		tree.insert(names[i]);
	}
	
	do{
	cout << "Search(y/n)? ";
	cin >> search;
		
	if(search == 'y'){
		cout << "Name? ";
		cin >> name;
		searchn = tree.has(name);
		if(searchn == 1){
			cout << "Found! ";
			cout << name;
		}
		else
			cout << "Not Found ";
		}
	}while(search == 'y');
	
	do{
	cout << "\nDelete and insert new name(y/n)? ";
	cin >> del;
	
	if(del == 'y'){
		cout << "Name? ";
		cin >> name;
		searchn = tree.has(name);
		if(searchn == 1){
			tree.deleteNode(name);
			cout << "Which has been deleted? 1- father,2-mother,3-first child,4-second child,5-third child,6-fourth child ";
			cin >> i2;
			cout << "Enter new name: ";
			cin >> names[i2];
			tree.insert(names[i2]);
		}
		else
			cout << "Not Found! ";
		}
	}while(del == 'y');
	
	cout << "Father, Mother, Child 1, Child 2, Child 3, Child 4\n";	
	tree.display(1); //prefix display
	
}	
