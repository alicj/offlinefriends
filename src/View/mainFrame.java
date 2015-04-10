package View;

import Model.InitData;
import Model.Person;

import java.util.ArrayList;


import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.logging.Level;
import java.util.logging.Logger;

import javax.swing.*;

import org.apache.commons.lang3.ArrayUtils;
import org.apache.commons.lang3.time.StopWatch;

import algorithm.BST;
import algorithm.LinearSearch;
import java.util.Arrays;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Alic Jiang
 */
public class mainFrame extends javax.swing.JFrame {

	private InitData personData;
	private DefaultListModel personListModel;
	private int currentSize = 500;
	private int algorithm = 1;
	private double searchTime = 0;
	
	private final int sizeSmall = 1000;
	private final int sizeMedium = 5000;
	private final int sizeLarge = 10000;

	/**
	 * Creates new form mainFrame
	 */
	public mainFrame() {
		initModel();
		initComponents();
	}

	/**
	 * This method is called from within the constructor to initialize the form.
	 * WARNING: Do NOT modify this code. The content of this method is always
	 * regenerated by the Form Editor.
	 */
	@SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        dictSize = new javax.swing.ButtonGroup();
        algType = new javax.swing.ButtonGroup();
        searchInput = new javax.swing.JTextField();
        searchBtn = new javax.swing.JButton();
        resultPanel = new javax.swing.JScrollPane();
        resultList = new javax.swing.JList();
        title = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        sizeSmallBtn = new javax.swing.JRadioButton();
        sizeMediumBtn = new javax.swing.JRadioButton();
        sizeLargeBtn = new javax.swing.JRadioButton();
        version = new javax.swing.JLabel();
        credit = new javax.swing.JLabel();
        dictSizeTitle = new javax.swing.JLabel();
        hintText = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jSeparator2 = new javax.swing.JSeparator();
        searchBtn1 = new javax.swing.JRadioButton();
        searchBtn2 = new javax.swing.JRadioButton();
        searchBtn3 = new javax.swing.JRadioButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Offline Friends");
        setResizable(false);

        searchInput.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                searchInputActionPerformed(evt);
            }
        });

        searchBtn.setText("Search");
        searchBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                searchBtnActionPerformed(evt);
            }
        });

        resultList.setModel(personListModel);
        resultPanel.setViewportView(resultList);

        title.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        title.setText("Offline Friends");

        dictSize.add(sizeSmallBtn);
        sizeSmallBtn.setSelected(true);
        sizeSmallBtn.setText(Integer.toString(sizeSmall));
        sizeSmallBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sizeSmallBtnActionPerformed(evt);
            }
        });

        dictSize.add(sizeMediumBtn);
        sizeMediumBtn.setText(Integer.toString(sizeMedium));
        sizeMediumBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sizeMediumBtnActionPerformed(evt);
            }
        });

        dictSize.add(sizeLargeBtn);
        sizeLargeBtn.setText(Integer.toString(sizeLarge));
        sizeLargeBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sizeLargeBtnActionPerformed(evt);
            }
        });

        version.setText("v 0.1.0");

        credit.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        credit.setText("Created by Mingfei Jiang, Zichen Jiang, and Kirk Montour");

        dictSizeTitle.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        dictSizeTitle.setText("Dictionary Size");

        hintText.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        hintText.setText("Please enter the name you wish to search");

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel1.setText("Algorithm");

        algType.add(searchBtn1);
        searchBtn1.setSelected(true);
        searchBtn1.setText("Binary Search");
        searchBtn1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                searchBtn1ActionPerformed(evt);
            }
        });

        algType.add(searchBtn2);
        searchBtn2.setText("BST");
        searchBtn2.setToolTipText("");
        searchBtn2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                searchBtn2ActionPerformed(evt);
            }
        });

        algType.add(searchBtn3);
        searchBtn3.setText("TST");
        searchBtn3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                searchBtn3ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(title, javax.swing.GroupLayout.DEFAULT_SIZE, 122, Short.MAX_VALUE)
                                .addComponent(jSeparator1)
                                .addComponent(jSeparator2, javax.swing.GroupLayout.Alignment.TRAILING))
                            .addComponent(dictSizeTitle)
                            .addComponent(sizeSmallBtn)
                            .addComponent(sizeMediumBtn)
                            .addComponent(sizeLargeBtn)
                            .addComponent(jLabel1)
                            .addComponent(searchBtn1)
                            .addComponent(searchBtn2)
                            .addComponent(searchBtn3))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(resultPanel)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(searchInput, javax.swing.GroupLayout.PREFERRED_SIZE, 194, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(searchBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(hintText, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(version)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(credit)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(searchInput, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(searchBtn))
                    .addComponent(title, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(dictSizeTitle))
                    .addComponent(hintText, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(sizeSmallBtn)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(sizeMediumBtn)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(sizeLargeBtn)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(searchBtn1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(searchBtn2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(searchBtn3))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(1, 1, 1)
                        .addComponent(resultPanel, javax.swing.GroupLayout.PREFERRED_SIZE, 208, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(12, 12, 12)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(version)
                    .addComponent(credit))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

	// change dictionary size to 500
    private void sizeSmallBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sizeSmallBtnActionPerformed
		updatePersonData(sizeSmall);
    }//GEN-LAST:event_sizeSmallBtnActionPerformed

    private void searchInputActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_searchInputActionPerformed
		// TODO add your handling code here:
		searchBtnActionPerformed(evt);
    }//GEN-LAST:event_searchInputActionPerformed

	// change dictionary size to 2500
    private void sizeMediumBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sizeMediumBtnActionPerformed
		updatePersonData(sizeMedium);
    }//GEN-LAST:event_sizeMediumBtnActionPerformed

	// search button action listener
    private void searchBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_searchBtnActionPerformed
		// TODO add your handling code here:
		String searchTerm = searchInput.getText();
		hintText.setText("Searching for \"" + searchTerm + "\" ...");

		// if search input is empty, show complete friend lst
		if (searchTerm.length() == 0) {
			updateResultList(personListModel);
			hintText.setText("Showing complete friend list");
			return;
		}

		// do the search
		Person[] result = search(searchTerm);
		// convert Person[] to DefaultListModel
		DefaultListModel searchResult = setListModel(result);
		
		// update view
		if (result.length > 0) {
			updateHintText("Found " + result.length + " results (" + searchTime + " ms)");
			// write result to file
			try {
				writeResult(searchTerm);
			} catch (IOException ex) {
				Logger.getLogger(mainFrame.class.getName()).log(Level.SEVERE, null, ex);
			}
		}else
			updateHintText("No result");
		updateResultList(searchResult);
    }//GEN-LAST:event_searchBtnActionPerformed

	// change dictionary size to 10000
    private void sizeLargeBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sizeLargeBtnActionPerformed
		updatePersonData(sizeLarge);
    }//GEN-LAST:event_sizeLargeBtnActionPerformed

// change searching algorith to Binary Search
    private void searchBtn1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_searchBtn1ActionPerformed
		algorithm = 1;
		updateHintText("Switched to Linear Search");
    }//GEN-LAST:event_searchBtn1ActionPerformed
	// change searching algorithm to Binary Search Tree
    private void searchBtn2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_searchBtn2ActionPerformed
		algorithm = 2;
		updateHintText("Switched to Binary Search Tree");
    }//GEN-LAST:event_searchBtn2ActionPerformed
	// change searching algorithm to Ternary Search Tree
    private void searchBtn3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_searchBtn3ActionPerformed
		algorithm = 3;
		updateHintText("Switched to Ternary Search Tree");
    }//GEN-LAST:event_searchBtn3ActionPerformed

	// initialize personData (import names from file)
	// and set the JList with the names from personData
	private void initModel() {
		personData = new InitData();
		personListModel = setListModel(personData.getData());
	}

	// update the personData variable to the desired size
	private void updatePersonData(int size) {
		if (currentSize != size) {
			updateHintText("Importing dictionary, please stand by ...");
			currentSize = size;
			// initilize stop watch to get time comsumed for importing dictionary
			StopWatch sw = new StopWatch();
			sw.start();
			double startTime = sw.getTime();
			personData = new InitData(size);
			double runTime = sw.getTime() - startTime;
			sw.stop();
			// update person list model
			personListModel = setListModel(personData.getData());
			// update view
			updateResultList(personListModel);
			// update text
			updateHintText("Import completed in " + Long.toString(Math.round(runTime)) + " ms");
		}
	}

	// update the personListModel variable, prepare to be displayed
	private DefaultListModel setListModel(Person[] pData) {
		DefaultListModel listModel = new DefaultListModel();
		for (Person pData1 : pData) {
			listModel.addElement(pData1);
		}
		return listModel;
	}

	// update the view (JList)
	private void updateResultList(DefaultListModel list) {
		resultList.setModel(list);
		resultPanel.setViewportView(resultList);
	}

	// update the JLable underneath the search bar
	private void updateHintText(String text) {
		hintText.setText(text);
	}

	// searching algorithm
	private Person[] search(String input) {
		Person[] personsFirst = new Person[currentSize];
		Person[] personsLast = new Person[currentSize];
		
		
		Person[] result = new Person[0];
		StopWatch sw = new StopWatch();
		sw.start();
		double startTime;
		switch (algorithm) {
			case 1:
				//linear search
				Person[] data = personData.getData();
				startTime = sw.getTime();
				result = LinearSearch.search(data, input);
				searchTime = sw.getTime() - startTime;
				break;
			case 2:
				//initialize bst				
				BST<String, Integer> firstNamesBST = new BST<> ();
				BST<String, Integer> lastNamesBST = new BST<> ();
				
				personData.mergeSortFirst();
				personsFirst = personData.getData().clone();
				for(int i=0; i<personsFirst.length; i++){
					firstNamesBST.put(personsFirst[i].getFirstName(), i);
				}
				
				personData.mergeSortLast();
				personsLast = personData.getData().clone();
				for(int i=0; i<personsLast.length; i++){
					lastNamesBST.put(personsLast[i].getLastName(), i);
				}
				
				startTime = sw.getTime();
				
				//initialize Binary Search Tree for First Names
				ArrayList<Integer> firstNameRanks = new ArrayList<> ();
				Integer rank = -2;		
				BST tempBST = new BST(firstNamesBST);
				
				//searches for name
				//if name is found, record the rank, and remove the name from temp array
				//repeat until no results
				while(rank != null){
					rank = (Integer) tempBST.get(input);
					if (rank != null){
						firstNameRanks.add(rank);
					}
				}
					
				Person[] firstNameResults = new Person[firstNameRanks.size()];
				for (int i=0; i<firstNameRanks.size(); i++){
					firstNameResults[i] = personsFirst[firstNameRanks.get(i)];
				}
				
				//initialize Binary Search Tree for Last Names
				ArrayList<Integer> lastNameRanks = new ArrayList<> ();
				rank = -2;		
				tempBST = new BST(lastNamesBST);
				
				//searches for name
				//if name is found, record the rank, and remove the name from temp array
				//repeat until no results
				while(rank != null){
					rank = (Integer) tempBST.get(input);
					if (rank != null){
						lastNameRanks.add(rank);
					}
				}
					
				Person[] lastNameResults = new Person[lastNameRanks.size()];
				for (int i=0; i<lastNameRanks.size(); i++){
					lastNameResults[i] = personsLast[lastNameRanks.get(i)];
				}

				searchTime = sw.getTime() - startTime;
				result = ArrayUtils.addAll(firstNameResults,lastNameResults);
				break;
			case 3:
				startTime = sw.getTime();
				// implement ternery search tree
				searchTime = sw.getTime() - startTime;
				result = new Person[0];
				break;
		}
		sw.stop();
		return result;
	}

	// write search result to file
	private void writeResult(String searchTerm) throws IOException {
		File file =new File("data/"+algorithm);
		if(!file.exists()){
    		file.createNewFile();
    	}
		try (PrintWriter out = new PrintWriter(new BufferedWriter(new FileWriter(file.getPath(), true)))) {
			out.println(searchTerm + "," + Long.toString(Math.round(searchTime)));
		}
	}

	/**
	 * @param args the command line arguments
	 */
	public static void main(String args[]) {
		/* Set the Nimbus look and feel */
		//<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
		 * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
		 */
		try {
			for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
				if ("Nimbus".equals(info.getName())) {
					javax.swing.UIManager.setLookAndFeel(info.getClassName());
					break;
				}
			}
		} catch (ClassNotFoundException | InstantiationException | IllegalAccessException | javax.swing.UnsupportedLookAndFeelException ex) {
			java.util.logging.Logger.getLogger(mainFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
		}
		//</editor-fold>

		/* Create and display the form */
		java.awt.EventQueue.invokeLater(new Runnable() {
			@Override
			public void run() {
				new mainFrame().setVisible(true);
			}
		});
	}

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup algType;
    private javax.swing.JLabel credit;
    private javax.swing.ButtonGroup dictSize;
    private javax.swing.JLabel dictSizeTitle;
    private javax.swing.JLabel hintText;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JList resultList;
    private javax.swing.JScrollPane resultPanel;
    private javax.swing.JButton searchBtn;
    private javax.swing.JRadioButton searchBtn1;
    private javax.swing.JRadioButton searchBtn2;
    private javax.swing.JRadioButton searchBtn3;
    private javax.swing.JTextField searchInput;
    private javax.swing.JRadioButton sizeLargeBtn;
    private javax.swing.JRadioButton sizeMediumBtn;
    private javax.swing.JRadioButton sizeSmallBtn;
    private javax.swing.JLabel title;
    private javax.swing.JLabel version;
    // End of variables declaration//GEN-END:variables
}
