## Final Projects
----
#### Minmal SQL Database.
----
                /*

                Yet to work with:
                    # custom Comparator
                    # command parsing
                    # storing
                    # DISTINCT command
                    # verifying everything
                */


                #include <bits/stdc++.h>
                using  namespace std;

                int col=0;

                void createTable(string){}
                void updateTable(string){}
                void insertInto(string){}
                void deleteFromTable(string){}
                void showTable(string){}

                template<class P,class A,class V>
                class TABLE
                {
                  private:
                      map<P,map<A,V> > table;
                      vector<string> attribute;

                  public:
                      TABLE(){}
                      void setAttribute(string tm);
                      void insertRow(string tx);
                      void insertRow(string attr,string value);
                      void removeRow();
                      string select(string ,string,string );
                      int getAtrIndex(string atr);
                      string getAtr(int index);
                      bool checkCondition(string ,string, string,bool);
                      bool checkPrimaryExist(string);
                      bool getDataType(int index);
                      void deleteRow(string condition);
                      void updateValue(string ,string);

                };


                int asc( const void *aa, const void  *bb)
                {
                    string *a=(string *)aa;
                    string *b=(string *)bb;

                //    cout<<a[col]<<" ----- "<<b[col]<<endl;
                    try{
                        double x, y;
                        x=stod(a[col]);y=stod(b[col]);
                        if (x<y)//a[col]>a[col] for descending order
                            return -1;
                        else if (x==y)
                            return 0;
                        else
                            return 1;
                    }catch(exception& e){
                        string x=a[col],y=b[col];
                        int l=min(x.length(),y.length()),i;
                        for(i=0;i<l;i++){
                            if(y[i]>x[i])
                                return 1;
                        }
                        //cout<<x<<" ----"<<y<<i<<endl;
                        if (i==l && y.length() > x.length()){
                                //a[col]>a[col] for descending order
                            return 1;
                            cout<<"dd----1"<<endl;
                        }
                        else if (x==y)
                            return 0;
                        else
                            return -1;
                    }

                }

                int dsc( const void *aa, const void  *bb)
                {
                    string *a=(string *)aa;
                    string *b=(string *)bb;
                    cout<<a[col]<<" ----- "<<b[col]<<endl;
                    if (a[col]>b[col])
                        return -1;
                    else if (a[col]==b[col])
                        return 0;
                    else
                        return 1;
                }

                void warn(){
                    cout<<"Invalid SQL command...try again"<<endl;
                }

                map<string, TABLE<string,string,string> > ex;
                int main(){
                   /* string nam,condition,order,toselect,q1;
                    cout<<"#SQL>> ";
                    cin>>q1;
                    while(q1!="exit"){
                        transform(q1.begin(),q1.end(),q1.begin(),::toupper);
                        string query=q1,tm;
                        getline(cin,tm,';');
                        //cout<<"|"<<query<<"|"<<endl;
                        tm.erase(remove(tm.begin(), tm.end(), '\n'), tm.end());
                        tm.erase(remove(tm.begin(), tm.end(), ' '), tm.end());
                        if(tm=="CREATE"){
                            createTable(tm);
                        }
                        else if(tm=="SELECT"){
                            showTable(tm);
                        }
                        else if(tm=="DELETE"){
                            deleteFromTable(tm);
                        }
                        else if(tm=="UPDATE"){
                            updateTable(tm);
                        }
                        else if(tm=="INSERT"){
                            insertInto(tm);
                        }
                        else{
                            warn();
                        }
                        regex e("varchar",regex::icase);
                        tm=regex_replace(tm,e," VARCHAR");
                        cout<<tm<<endl;
                        cout<<"#SQL>> ";
                        cin>>q1;
                    }











                    /*CREATE TABLE ( PersonID int,LastName varchar(25 ),Address varchar( 255),City varchar(255),Age int);

                    CREATE TABLE   (
                    PersonID int,
                    LastName Varchar(25) ,
                    Address vaRchar(255),
                    City varchar( 255),
                    Age int
                    );
                        */




                    TABLE<string,string,string> table;
                    string nam="tableName";
                    ex[nam]=table;
                    ex[nam].setAttribute("PersonID int,LastName varchar,FirstName varchar(255),Address varchar(255),City varchar(255),Age int");
                    ex[nam].insertRow("126,'Koshia','Al amin','IIUm ali','gombak',75");
                    ex[nam].insertRow("121,'Ashik','Al amin','IIUm ali','bombake',65");
                    ex[nam].insertRow("122,'akahs','Al amin','IIUm ali','gombak',15");
                    ex[nam].insertRow("123,'Koshi','Al amin','IIUm ali','hombak',50");
                    ex[nam].insertRow("124,'Koshi','Al amin','IIUm ali','lombak',15");
                    ex[nam].insertRow("125,'orion','Al amin','IIUm ali','vombake',115");
                    ex[nam].insertRow("126,'Koshia','Al amin','IIUm ali','gombake',25");
                    ex[nam].insertRow("PersonID,FirstName,Address,City","135,'Al amin','IIUm ali','gombake'");


                    cout<<ex[nam].select("*","NA","City")<<endl;
                    ex[nam].updateValue("City = 'GOMBAK' , Age = 505","City = 'gombake' OR LastName = 'Koshi'");

                    cout<<ex[nam].select("*","NA","City")<<endl;
                    ex[nam].deleteRow("City = 'gombak' OR LastName = 'Koshia'");
                    cout<<ex[nam].select("*","NA","City")<<endl;
                    ex[nam].deleteRow("PersonID = 125");
                    cout<<ex[nam].select("*","NA","City")<<endl;
                    cout<<ex[nam].select("*","City = 'gombake' AND PersonID > 122","Age")<<endl;
                    cout<<ex[nam].select("*","City = 'gombake' OR LastName = 'Koshi'","NA")<<endl;
                    cout<<ex[nam].select("PersonID,City,Age","City = 'gombak' OR LastName = 'Koshi'","NA")<<endl;
                    cout<<ex[nam].select("*","City = 'gombake' OR LastName = 'Koshi'","NA")<<endl;
                    cout<<ex[nam].select("*","City = 'gombake' OR LastName = 'Koshi'","Age")<<endl;
                    cout<<ex[nam].select("*","City = 'gombake' OR LastName = 'Koshi'","Age DESC")<<endl;
                    cout<<ex[nam].select("*","City = 'gombake' OR LastName = 'Koshi'","Age ASC")<<endl;
                    cout<<ex[nam].select("PersonID,City,Age","City = 'gombak' OR LastName = 'Koshi'","NA")<<endl;
                    cout<<ex[nam].select("PersonID,City,Age","City = 'gombak' OR LastName = 'Koshi'","Age DESC")<<endl;
                    cout<<ex[nam].select("PersonID,City,Age","City = 'gombak' OR LastName = 'Koshi'","Age ASC")<<endl;
                    cout<<ex[nam].select("PersonID,City,Age","City = 'gombak' OR LastName = 'Koshi'","Age")<<endl;


                }

                template<class P,class A,class V>
                string TABLE<P,A,V>::getAtr(int index){
                        istringstream isa(attribute[index]);
                        string ex;
                        isa>>ex;
                        return ex;
                }


                template<class P,class A,class V>
                bool TABLE<P,A,V>::checkCondition(string val1, string op,string val2,bool str){


                   // cout<<val1<<" || "<<val2<<endl;
                    if(op=="=")
                        return val1==val2;
                    else if(op=="<>")
                        return val1!=val2;
                    else if(op==">"){
                        if(str)
                            return val1>val2;
                        else
                            return stoi(val1)>stoi(val2);
                    }
                    else if(op=="<"){
                        if(str)
                            return val1<val2;
                        else
                            return stoi(val1)<stoi(val2);
                    }
                    else if(op==">="){
                        if(str)
                            return val1>=val2;
                        else
                            return stoi(val1)>=stoi(val2);
                    }
                    else if(op=="<="){
                        if(str)
                            return val1<=val2;
                        else
                            return stoi(val1)<=stoi(val2);
                    }
                    else{
                        cout<<"Invalid operator "<<endl;
                    }

                }
                template<class P,class A,class V>
                bool TABLE<P,A,V>::getDataType(int index){
                        //cout<<"Atr age: "<<attribute[index-1]<<endl;
                        bool datatype=true;//true for string;
                        // cout<<"atribute :: >> "<<attribute[index]<<endl;
                        istringstream idataT(attribute[index]);
                        string type;
                        idataT>>type>>type;
                        transform(type.begin(),type.end(),type.begin(),::tolower);
                        if(type.find("varchar")==string::npos){
                            datatype=false;
                        }
                        return datatype;

                }



                template<class P,class A,class V>
                bool TABLE<P,A,V>::checkPrimaryExist(string key){
                    bool ans=false;
                    for(auto it=table.begin();it!=table.end();it++){
                        string tm=it->first;
                        if(tm.find(key)!=string::npos)
                            ans=true;
                    }
                    return ans;
                }



                template<class P,class A,class V>
                int TABLE<P,A,V>::getAtrIndex(string atr){
                    int index=-1;
                    for(int i=0;i<attribute.size();i++){
                        if(attribute[i].find(atr)!=string::npos)
                            index=i;
                    }
                    //cout<<atr<<" at"<<index<<endl;
                    return index;

                }




                template<class P,class A,class V>
                void TABLE<P,A,V>::setAttribute(string atr){
                    istringstream iss(atr);
                    string token;
                    while(getline(iss,token,',')){
                        attribute.push_back(token);
                    }

                }
                template<class P,class A,class V>
                void TABLE<P,A,V>::insertRow(string val){

                    string primaryKey,primaryAtr;
                    istringstream ia(val);
                    getline(ia,primaryKey,',');

                    if(getDataType(0))
                        primaryKey=primaryKey.substr(1,primaryKey.length()-2);
                    //cout<<primaryKey<<"pri dat: "<<getDataType(0)<<endl;
                    if(checkPrimaryExist(primaryKey)){
                        cout<<"Primary key "<<primaryKey<<" is already exist "<<endl;return;
                    }
                    istringstream ipa(attribute[0]);
                    ipa>>primaryAtr;
                    map<A,V> tm;
                    tm["0"+primaryAtr]=primaryKey;
                    for(int i=1;i<attribute.size();i++){

                        istringstream iss(attribute[i]);
                        string token;
                        iss>>token;

                        string colValue;
                        getline(ia,colValue,',');
                        //cout<<"Col value"<<colValue<<endl;
                        if(getDataType(i))
                            colValue=colValue.substr(1,colValue.length()-2);
                        tm[to_string(i)+token]=colValue;
                    }
                    primaryKey=to_string(table.size())+primaryKey;
                    cout<<"Primary Ke1: "<<primaryKey<<endl;
                    table[primaryKey]=tm;
                    //cout<<"table size=> "<<table.size()<<endl;
                }




                template<class P,class A,class V>
                void TABLE<P,A,V>::insertRow(string atr,string value){
                    istringstream isAtr(atr);
                    istringstream isVal(value);

                    string primaryKey,primaryAtr,tmAtr,tmVal;

                    getline(isAtr,primaryAtr,',');
                    istringstream ipatr(attribute[0]);
                    string oPrimaryAtr;
                    ipatr>>oPrimaryAtr;
                   // cout<<"original : "<<oPrimaryAtr<<" primaatr " <<primaryAtr<<endl;
                    if(primaryAtr!=oPrimaryAtr){
                        cout<<"Primary Key can't be null,primary attribute missing"<<endl;
                        return;
                    }
                    getline(isVal,primaryKey,',');
                    if(getDataType(0))
                        primaryKey=primaryKey.substr(1,primaryKey.length()-2);
                    if(checkPrimaryExist(primaryKey)){
                        cout<<"Primary Key "<<primaryKey<<" already exist "<<endl;return;
                    }
                    map<A,V> tm;
                    tm["0"+primaryAtr]=primaryKey;
                    while(getline(isAtr,tmAtr,',') && getline(isVal,tmVal,',')){
                        int index=getAtrIndex(tmAtr);
                        if(getDataType(index))
                            tmVal=tmVal.substr(1,tmVal.length()-2);
                        //cout<<"tmAtr: "<<tmAtr<<" index@@: "<<getAtrIndex(tmAtr)<<endl;
                        tm[to_string(index)+tmAtr]=tmVal;
                    }
                    for(int i=1;i<attribute.size();i++){
                        istringstream iss(attribute[i]);
                        string is;
                        iss>>is;
                       // cout<<"is -=="<<is<<endl;
                        if(tm.find(to_string(i)+is)==tm.end())
                            tm[to_string(i)+is]="null";
                    }
                    if(getDataType(0))
                        primaryKey=primaryKey.substr(1,primaryKey.length()-2);
                    primaryKey=to_string(table.size())+primaryKey;
                    cout<<"Primary Ke2: "<<primaryKey<<endl;
                    table[primaryKey]=tm;
                    //cout<<"table size=> "<<table.size()<<endl;
                }



                template<class P,class A,class V>
                string TABLE<P,A,V>::select(string toselect ,string condition , string order){
                    cout<<toselect<<"->"<<condition<<"->"<<order<<endl;
                    if(table.size()==0)
                    {
                        cout<<"Table is empty "<<endl;return "";
                    }
                    int row=table.size(),colum=attribute.size();
                    bool brow[row],bcolum[colum];
                   // cout<<"------------------------------"<<colum<<endl;
                    stringstream ss;
                    string output[row][colum],copyOutput[row][colum];

                    for(int i=0;i<colum;i++){
                        bcolum[i]=false;
                    }

                    int i=0;
                    for(auto it=table.begin();it!=table.end();it++,i++){
                        map<A,V> tm=it->second;
                        brow[i]=false;
                        int j=0;
                       // cout<<it->first<<" ";
                        for(auto jt=tm.begin();jt!=tm.end();jt++,j++){
                            //cout<<jt->first<<"->"<<jt->second<<" ";
                            output[i][j]=jt->second;
                        }
                       // cout<<endl;
                            //ss<<"||>>"<<endl;
                    }
                    if(condition!="NA"){
                        istringstream icon(condition);
                        string atr1,op,val,andOr;
                        bool flag=false;
                        while(icon>>atr1>>op>>val){

                            int index=getAtrIndex(atr1);
                            if(index==-1){
                                cout<<"Invalid attribute "<<endl;
                                return "";
                            }
                            //cout<<"index == "<<index<<" "<<atr1<<" "<<op<<" "<<val<<endl;
                            bool datatype=getDataType(index);
                            if(datatype)
                                val=val.substr(1,val.length()-2);
                            //cout<<"Datatype => "<<datatype<<" type: "<<type<<endl;
                            //cout<<"index : "<<index<<endl;
                            for(int i=0;i<row;i++){
                                if(output[i][index]=="null")
                                    continue;
                                bool cur=checkCondition(output[i][index],op,val,datatype);
                //cout<<"Flag: "<<flag<<"curValue : "<<output[i][index+1]<<" op : "<<op<<" val: "<<val<<" cur:"<<cur<<endl;

                                if(flag){
                                   // cout<<"storing :: "<<(cur || stored )<<endl;
                                    brow[i]=(cur && brow[i] );
                                }
                                else{
                                   // cout<<"storing :: "<<(cur || stored )<<endl;
                                    brow[i]=(cur || brow[i] );
                                }
                            }
                            if(icon>>andOr){
                                //cout<<"andOr = "<<andOr<<endl;
                                if(andOr=="AND")
                                    flag=true;
                                else
                                    flag=false;
                            }
                            else
                                break;
                        }
                    }
                    else{
                        for(int i=0;i<row;i++)
                            brow[i]=true;
                    }

                    if(toselect != "*"){
                        istringstream is(toselect);
                        string tmp;
                        while(getline(is,tmp,',')){

                            int index=getAtrIndex(tmp);
                            if(index!=-1){
                                cout<<left<<setw(15)<<tmp;
                                bcolum[index]=true;
                            }
                          //  cout<<tmp<<"->"<<index<<endl;
                        }
                        cout<<endl;
                    }
                    else{
                        for(int i=0;i<colum;i++){
                            bcolum[i]=true;
                            cout<<left<<setw(15)<<getAtr(i);
                        }
                        cout<<endl;
                    }
                    if(order!="NA"){
                        for(int i=0;i<row;i++)
                            for(int j=0;j<colum;j++)
                                copyOutput[i][j]=output[i][j];
                        istringstream iorder(order);
                        string str;
                        while(getline(iorder,str,',')){
                            string atr,order="ASC";
                            istringstream isort(str);
                            isort>>atr;
                            col=getAtrIndex(atr);
                            if(isort>>order){}

                            if(order=="ASC"){
                                cout<<"ASC --------------- "<<output[2][col]<<endl;
                                qsort(output,row,sizeof(copyOutput[0]),asc);
                            }
                            else{
                                cout<<" DSC --------------- "<<col<<endl;
                                qsort(output,row,sizeof(copyOutput[0]),dsc);
                            }
                            col=0;

                        }
                    }

                        //return ss.str();
                    for(int i=0;i<row;i++){
                        bool b=false;
                        for(int j=0;j<colum;j++){
                           // cout<<brow[i]<<","<<bcolum[j]<<endl;
                            if(brow[i] && bcolum[j]){
                                if(order=="NA")
                                    cout<<left<<setw(15)<<output[i][j];
                                else
                                    cout<<left<<setw(15)<<copyOutput[i][j];
                                b=true;
                            }
                        }
                        if(b)
                            cout<<endl;
                    }
                    cout<<endl<<endl;
                    return "ok";

                }

                template<class P,class A,class V>
                void TABLE<P,A,V>::deleteRow(string condition){
                    cout<<"DELETING --------------------->>>"<<condition<<"->"<<endl;
                    int row=table.size(),colum=attribute.size();
                    bool brow[row];
                   // cout<<"------------------------------"<<colum<<endl;
                    stringstream ss;
                    string output[row][colum];

                    int i=0;
                    for(auto it=table.begin();it!=table.end();it++,i++){
                        map<A,V> tm=it->second;
                        brow[i]=false;
                        int j=0;
                       // cout<<it->first<<" ";
                        for(auto jt=tm.begin();jt!=tm.end();jt++,j++){
                            //cout<<jt->first<<"->"<<jt->second<<" ";
                            output[i][j]=jt->second;
                        }
                       // cout<<endl;
                            //ss<<"||>>"<<endl;
                    }
                    if(condition!="NA"){
                        istringstream icon(condition);
                        string atr1,op,val,andOr;
                        bool flag=false;
                        while(icon>>atr1>>op>>val){

                            int index=getAtrIndex(atr1);
                            if(index==-1){
                                cout<<"Invalid attribute "<<endl;
                                return ;
                            }
                            //cout<<"index == "<<index<<" "<<atr1<<" "<<op<<" "<<val<<endl;
                            bool datatype=getDataType(index);
                            if(datatype)
                                val=val.substr(1,val.length()-2);
                            //cout<<"Datatype => "<<datatype<<" type: "<<type<<endl;
                            //cout<<"index : "<<index<<endl;
                            for(int i=0;i<row;i++){
                                bool cur=checkCondition(output[i][index],op,val,datatype);
                //cout<<"Flag: "<<flag<<"curValue : "<<output[i][index+1]<<" op : "<<op<<" val: "<<val<<" cur:"<<cur<<endl;

                                if(flag){
                                   // cout<<"storing :: "<<(cur || stored )<<endl;
                                    brow[i]=(cur && brow[i] );
                                }
                                else{
                                   // cout<<"storing :: "<<(cur || stored )<<endl;
                                    brow[i]=(cur || brow[i] );
                                }
                            }
                            if(icon>>andOr){
                                //cout<<"andOr = "<<andOr<<endl;
                                if(andOr=="AND")
                                    flag=true;
                                else
                                    flag=false;
                            }
                            else
                                break;
                        }
                    }
                    else{
                        for(int i=0;i<row;i++)
                            brow[i]=true;
                    }
                        //return ss.str();
                    for(int i=0;i<row;i++){
                        if(brow[i]){
                            for(auto it=table.begin();it!=table.end();it++){
                                string key=it->first;
                                if(key.substr(1)==output[i][0]){
                                    table.erase(it);break;
                                }

                            }

                        }
                    }
                }









                template<class P,class A,class V>
                void TABLE<P,A,V>::updateValue(string toselect ,string condition){
                    cout<<"Updating------------------>>>>>>"<<toselect<<"->"<<condition<<"->"<<endl;
                    if(table.size()==0)
                    {
                        cout<<"Table is empty "<<endl;return ;
                    }
                    int row=table.size(),colum=attribute.size();
                    bool brow[row];
                   // cout<<"------------------------------"<<colum<<endl;
                    stringstream ss;
                    string output[row][colum];

                    int i=0;
                    for(auto it=table.begin();it!=table.end();it++,i++){
                        map<A,V> tm=it->second;
                        brow[i]=false;
                        int j=0;
                       // cout<<it->first<<" ";
                        for(auto jt=tm.begin();jt!=tm.end();jt++,j++){
                            //cout<<jt->first<<"->"<<jt->second<<" ";
                            output[i][j]=jt->second;
                        }
                       // cout<<endl;
                            //ss<<"||>>"<<endl;
                    }
                    if(condition!="NA"){
                        istringstream icon(condition);
                        string atr1,op,val,andOr;
                        bool flag=false;
                        while(icon>>atr1>>op>>val){

                            int index=getAtrIndex(atr1);
                            if(index==-1){
                                cout<<"Invalid attribute "<<endl;
                                return ;
                            }
                            //cout<<"index == "<<index<<" "<<atr1<<" "<<op<<" "<<val<<endl;
                            bool datatype=getDataType(index);
                            if(datatype)
                                val=val.substr(1,val.length()-2);
                            //cout<<"Datatype => "<<datatype<<" type: "<<type<<endl;
                            //cout<<"index : "<<index<<endl;
                            for(int i=0;i<row;i++){
                                if(output[i][index]=="null")
                                    continue;
                                bool cur=checkCondition(output[i][index],op,val,datatype);
                //cout<<"Flag: "<<flag<<"curValue : "<<output[i][index+1]<<" op : "<<op<<" val: "<<val<<" cur:"<<cur<<endl;

                                if(flag){
                                   // cout<<"storing :: "<<(cur || stored )<<endl;
                                    brow[i]=(cur && brow[i] );
                                }
                                else{
                                   // cout<<"storing :: "<<(cur || stored )<<endl;
                                    brow[i]=(cur || brow[i] );
                                }
                            }
                            if(icon>>andOr){
                                //cout<<"andOr = "<<andOr<<endl;
                                if(andOr=="AND")
                                    flag=true;
                                else
                                    flag=false;
                            }
                            else
                                break;
                        }
                    }
                    else{
                        for(int i=0;i<row;i++)
                            brow[i]=true;
                    }
                    vector<pair<int,string> > atrVec;
                    istringstream is(toselect);
                    string atr,tmp,value;
                    while(is>>atr>>tmp>>value){
                         //cout<<atr<<tmp<<value<<endl;
                         int index=getAtrIndex(atr);
                         if(index==-1){
                             cout<<"Invalid attribute name"<<endl;return;
                         }
                         else if(index==0){
                            cout<<"Primary key can't be updated "<<endl;return;
                         }
                         if(getDataType(index))
                             value=value.substr(1,value.length()-2);
                         cout<<index<<"--update-->"<<value<<endl;
                         atrVec.push_back(make_pair(index,value));
                         if(!is.eof()){
                            is>>tmp;
                            cout<<tmp<<endl;
                         }
                         else
                            break;

                    }
                    i=0;
                    for(auto it=table.begin();it!=table.end();it++,i++){

                        if(brow[i]){
                            for(int j=0;j<atrVec.size();j++){
                                //cout<<atrVec[j].first<<"  "<<atrVec[j].second<<endl;
                                auto & mrow=it->second;
                                int k=0,index=atrVec[j].first;
                                for(auto jt=mrow.begin();jt!=mrow.end();jt++,k++){
                                    if(k==index){
                                        jt->second=atrVec[j].second;
                                        //cout<<jt->first<<" == "<<jt->second<<" ,"<<atrVec[j].second<<endl;
                                    }
                                }
                            }
                        }

                    }
                }

#### Our Team - 
----

**Team Name: Atapaata**

**Project Name: Minimal SQL Database **

**Section: 3 **

**Members:**

  1. TABASSUM TAHERA (1413986)
  
  2. MD SHARIFUL ISLAM (1412813)
  
  3. NAZMUS SAKIB (1425433)
  
  4. Mohammod Al Amin Ashik (1326493)
  
----

### Report

Minimal SQL Database
Algorithm
	
INSERT/ CREATE TABLE : For each table row A Map data structured is created and filled with  value with having attribute name as first index. Each row is inserted into another Map data structure having primary as first index and early created map as second index.
WHERE : based on each condition of where the table row is flagged as true or false. 
SELECT : if it’s  ‘*’ ,  all colum is flagged as true. In Other case only selected colum is flagged as true.
UPDATE : based on WHERE condition rows are flagged as true or false. Then by iterating through the table value are updated if the row flagged as true;
DELETE : based on WHERE condition rows are flagged and deleted;


Limitation:
 
·	1. Primary Key can’t be null
·	2. Primary can’t be updated
·	3 can’t contain ‘,’ character in the value
·	4. Int or decimal value should be without ‘ ’ and string must have to be enclosed with ‘ ’
·	
.


Still working on!...
